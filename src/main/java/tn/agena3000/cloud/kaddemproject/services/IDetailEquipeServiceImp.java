package tn.agena3000.cloud.kaddemproject.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.agena3000.cloud.kaddemproject.entities.DetailEquipe;
import tn.agena3000.cloud.kaddemproject.repositories.DetailEquipeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IDetailEquipeServiceImp implements IDetailEquipeService{
    private DetailEquipeRepository detailEquipeRepository;
    @Override
    public void ajouterDetailEquipe(DetailEquipe detailEquipe) {
detailEquipeRepository.save(detailEquipe);
    }

    @Override
    public void updateDetailEquipe(DetailEquipe detailEquipe) {
detailEquipeRepository.save(detailEquipe);
    }

    @Override
    public List<DetailEquipe> getAllDetailEquipe() {

        return detailEquipeRepository.findAll();
    }

    @Override
    public DetailEquipe getById(Integer idDetailEquipe) {
        return detailEquipeRepository.findById(idDetailEquipe).orElse(null);
    }

    @Override
    public void deleteDetailEquipe(Integer idDetailEquipe) {
detailEquipeRepository.deleteById(idDetailEquipe);
    }
}
