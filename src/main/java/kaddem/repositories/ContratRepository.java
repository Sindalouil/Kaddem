package kaddem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import kaddem.entities.Contrat;
import kaddem.entities.Departement;

public interface ContratRepository extends JpaRepository<Contrat, Integer> {
}
