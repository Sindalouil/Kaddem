package kaddem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kaddem.entities.Contrat;
import kaddem.entities.Departement;
import kaddem.repositories.ContratRepository;
import kaddem.repositories.DepartementRepository;

import java.util.List;

@Service
public class IContratServiceImp implements IContratServices{

    @Autowired
    private ContratRepository contratRepository;
    @Override
    public void ajouterContrat(Contrat c) {
        contratRepository.save(c);
    }

    @Override
    public void updateContrat(Contrat c) {
        contratRepository.save(c);
    }

    @Override
    public List<Contrat> getAllContrat() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat getByIdContrat(Integer id) {
        return contratRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteContrat(Integer id) {
        contratRepository.deleteById(id);
    }
}
