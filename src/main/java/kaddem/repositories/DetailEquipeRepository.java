package kaddem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import kaddem.entities.Contrat;
import kaddem.entities.DetailEquipe;

public interface DetailEquipeRepository extends JpaRepository<DetailEquipe, Integer> {
}
