package tn.agena3000.cloud.kaddemproject.services;

import tn.agena3000.cloud.kaddemproject.entities.Etudiant;

import java.util.List;

public interface IEtudiantServices {
    void ajouterEtudiant(Etudiant e);
    void updateEtudiant(Etudiant e);
    List<Etudiant> getAllEtudiants();
    Etudiant getById(Integer idEtudiant);
    void deleteEtudiant(Integer idEtudiant);
    public void assignEtudiantToDepartement (Integer etudiantId, Integer
            departementId) ;
    Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat,
                                                     Integer idEquipe);

}
