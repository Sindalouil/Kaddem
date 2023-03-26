package tn.agena3000.cloud.kaddemproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.agena3000.cloud.kaddemproject.entities.Contrat;
import tn.agena3000.cloud.kaddemproject.entities.Equipe;
import tn.agena3000.cloud.kaddemproject.entities.Option;

import java.util.List;

public interface EquipeRepository extends JpaRepository<Equipe,Integer> {
    List<Equipe> findByEtudiantsOptionAndEtudiantsContratsSpecialite(Option option,String specialite);
}
