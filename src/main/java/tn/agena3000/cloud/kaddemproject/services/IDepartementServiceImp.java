package tn.agena3000.cloud.kaddemproject.services;

import lombok.RequiredArgsConstructor;
import org.springframework.expression.spel.ast.Assign;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tn.agena3000.cloud.kaddemproject.entities.Departement;
import tn.agena3000.cloud.kaddemproject.entities.Etudiant;
import tn.agena3000.cloud.kaddemproject.entities.Universite;
import tn.agena3000.cloud.kaddemproject.repositories.DepartementRepository;
import tn.agena3000.cloud.kaddemproject.repositories.UniversiteRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class IDepartementServiceImp implements IDepartementService{

    private DepartementRepository departementRepository;
    private UniversiteRepository universiteRepository;
    @Override
    public void ajouterDepartement(Departement departement) {
departementRepository.save(departement);
    }

    @Override
    public void updateDepartement(Departement d) {
departementRepository.save(d);
    }

    @Override
    public List<Departement> getAllDepartement() {

        return departementRepository.findAll();
    }

    @Override
    public Departement getById(Integer idDepartement) {

        return departementRepository.findById(idDepartement).orElse(null);
    }

    @Override
    public void deleteDepartement(Integer idDepartement) {
        departementRepository.deleteById(idDepartement);

    }

    @Override
    @Transactional
    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement) {
        Departement departement = departementRepository.findById(idDepartement).orElse(null);
        Assert.isNull(departement,"No such department");
        Universite universite = universiteRepository.findById(idUniversite).orElse(null);
        Assert.isNull(universite,"No such universite");
        universite.getDepartements().add(departement);
        //universiteRepository.save(universite);
    }

    @Override
    public List<Etudiant> getEtudiantsByDepartement(Integer idDepartement) {
        Departement departement = departementRepository.findById(idDepartement).orElse(null);
        Assert.isNull(departement,"No such department");
        return departement.getEtudiants();
    }


}
