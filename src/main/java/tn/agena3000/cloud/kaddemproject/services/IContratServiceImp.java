package tn.agena3000.cloud.kaddemproject.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.agena3000.cloud.kaddemproject.entities.Contrat;
import tn.agena3000.cloud.kaddemproject.entities.Etudiant;
import tn.agena3000.cloud.kaddemproject.repositories.ContratRespository;
import tn.agena3000.cloud.kaddemproject.repositories.EtudiantRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IContratServiceImp implements IContratServices {
    private ContratRespository contratRep;
    private EtudiantRepository etudiantRepository;

    @Override
    public void ajouterContrat(Contrat c) {

        contratRep.save(c);
    }

    @Override
    public void updateContrat(Contrat c) {
        contratRep.save(c);

    }

    @Override
    public List<Contrat> getAllContrats() {

        return contratRep.findAll();
    }

    @Override
    public Contrat getById(Integer idContrat) {

        return contratRep.findById(idContrat).orElse(null);
    }

    @Override
    public void deleteContrat(Integer idContrat) {
        contratRep.deleteById(idContrat);
    }

    @Override
    public Contrat affectContratToEtudiant(Contrat ce, String nomE, String prenomE) {
        Etudiant e = etudiantRepository.findByNomEAndPrenomE(nomE, prenomE);

        int nbr = contratRep.countByArchiveIsFalseAndEtudiantNomEAndPrenomE(nomE,prenomE);
        if (nbr <= 5) {
            ce.setEtudiant(e);
            contratRep.save(ce);
            return ce;
        } else {
            return null;
        }

    }
}


