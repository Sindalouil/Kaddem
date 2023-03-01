package kaddem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import kaddem.entities.Universite;

public interface UniversiteRepository extends JpaRepository<Universite, Integer> {
}
