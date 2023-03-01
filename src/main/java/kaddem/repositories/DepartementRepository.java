package kaddem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import kaddem.entities.Departement;

public interface DepartementRepository extends JpaRepository<Departement, Integer> {
}
