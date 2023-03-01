package kaddem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import kaddem.entities.Equipe;
import kaddem.entities.Etudiant;

public interface EquipeRepository extends JpaRepository<Equipe,Integer> {
}
