package kaddem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import kaddem.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {
}
