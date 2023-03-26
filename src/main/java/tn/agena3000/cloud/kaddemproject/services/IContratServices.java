package tn.agena3000.cloud.kaddemproject.services;

import tn.agena3000.cloud.kaddemproject.entities.Contrat;

import java.util.List;

public interface IContratServices {
    void ajouterContrat(Contrat c);
    void updateContrat(Contrat c);
    List<Contrat> getAllContrats();
    Contrat getById(Integer idContrat);
    void deleteContrat(Integer idContrat);

    Contrat affectContratToEtudiant (Contrat ce, String nomE,String prenomE);

}
