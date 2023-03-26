package tn.agena3000.cloud.kaddemproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.agena3000.cloud.kaddemproject.entities.Contrat;
import tn.agena3000.cloud.kaddemproject.entities.Etudiant;

import java.util.Date;
import java.util.List;

public interface ContratRespository extends JpaRepository<Contrat,Integer> {

    int countByArchiveIsFalseAndEtudiantNomEAndPrenomE(String nomE,String prenomE);

    Contrat findByStartDateAndEndDate(Date startDate, Date endDate);

    List<Contrat> findByStartDateAndEndDateAndEtudiant(Date startDate, Date endDate, Etudiant etud);

    List<Contrat> findByEtudiant(Etudiant etud);
}
