package tn.agena3000.cloud.kaddemproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.agena3000.cloud.kaddemproject.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {
    Etudiant findByNomEAndPrenomE(String nomE,String prenomE);
}
