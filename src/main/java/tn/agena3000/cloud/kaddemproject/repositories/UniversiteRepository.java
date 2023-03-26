package tn.agena3000.cloud.kaddemproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.agena3000.cloud.kaddemproject.entities.Contrat;
import tn.agena3000.cloud.kaddemproject.entities.Universite;

public interface UniversiteRepository extends JpaRepository<Universite,Integer> {
}
