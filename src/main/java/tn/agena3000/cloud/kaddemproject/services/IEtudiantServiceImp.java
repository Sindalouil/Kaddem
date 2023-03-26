package tn.agena3000.cloud.kaddemproject.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.agena3000.cloud.kaddemproject.entities.Contrat;
import tn.agena3000.cloud.kaddemproject.entities.Departement;
import tn.agena3000.cloud.kaddemproject.entities.Equipe;
import tn.agena3000.cloud.kaddemproject.entities.Etudiant;
import tn.agena3000.cloud.kaddemproject.repositories.ContratRespository;
import tn.agena3000.cloud.kaddemproject.repositories.DepartementRepository;
import tn.agena3000.cloud.kaddemproject.repositories.EquipeRepository;
import tn.agena3000.cloud.kaddemproject.repositories.EtudiantRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class IEtudiantServiceImp implements IEtudiantServices {
    private EtudiantRepository etudiantReposiory;
    private DepartementRepository departementRepository;

    private ContratRespository contratRespository;
    private EquipeRepository equipeRepository;
    @Override
    public void ajouterEtudiant(Etudiant e) {
        etudiantReposiory.save(e);

    }

    @Override
    public void updateEtudiant(Etudiant e) {

        etudiantReposiory.save(e);
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
       return etudiantReposiory.findAll();

    }

    @Override
    public Etudiant getById(Integer idEtudiant) {
        return etudiantReposiory.findById(idEtudiant).orElse(null);

    }

    @Override
    public void deleteEtudiant(Integer idEtudiant) {

        etudiantReposiory.deleteById(idEtudiant);
    }

    @Override
    public void assignEtudiantToDepartement(Integer etudiantId, Integer departementId) {
        Etudiant etudiant = etudiantReposiory.findById(etudiantId).orElse(null);
        Departement departement = departementRepository.findById(departementId).orElse(null);
        if((etudiant!=null) && (departement!=null)){
            etudiant.setDepartement(departement);
            etudiantReposiory.save(etudiant);
        }


    }

    @Override
    @Transactional
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe) {
        Contrat contrat = contratRespository.findById(idContrat).orElse(null);
        Equipe equipe = equipeRepository.findById(idEquipe).orElse(null);
       etudiantReposiory.saveAndFlush(e);
        e.getEquipes().add(equipe);
        contrat.setEtudiant(e);
        return e;


    }
}
