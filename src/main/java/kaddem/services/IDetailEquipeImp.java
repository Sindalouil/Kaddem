package kaddem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kaddem.entities.Departement;
import kaddem.entities.DetailEquipe;
import kaddem.repositories.DepartementRepository;
import kaddem.repositories.DetailEquipeRepository;

import java.util.List;

@Service
public class IDetailEquipeImp implements IDetailEquipeServices{

    @Autowired
    private DetailEquipeRepository detailEquipeRepository;
    @Override
    public void ajouterDetailEquipe(DetailEquipe de) {
        detailEquipeRepository.save(de);
    }

    @Override
    public void updateDetailEquipe(DetailEquipe de) {
        detailEquipeRepository.save(de);
    }

    @Override
    public List<DetailEquipe> getAllDetailEquipe() {
        return detailEquipeRepository.findAll();
    }

    @Override
    public DetailEquipe getByIdDetailEquipe(Integer id) {
        return detailEquipeRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteDetailEquipe(Integer id) {
        detailEquipeRepository.deleteById(id);
    }
}
