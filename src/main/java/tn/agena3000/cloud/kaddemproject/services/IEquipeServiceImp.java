package tn.agena3000.cloud.kaddemproject.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.agena3000.cloud.kaddemproject.entities.Equipe;
import tn.agena3000.cloud.kaddemproject.repositories.EquipeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IEquipeServiceImp implements IEquipeService{
    private EquipeRepository equipeRepository;
    @Override
    public void ajouterEquipe(Equipe E) {
equipeRepository.save(E);
    }

    @Override
    public void updateEquipe(Equipe E) {
equipeRepository.save(E);
    }

    @Override
    public List<Equipe> getAllContrats() {

        return equipeRepository.findAll();
    }

    @Override
    public Equipe getById(Integer idEquipe) {

        return equipeRepository.findById(idEquipe).orElse(null);
    }
    @Override
    public void deleteEquipe(Integer idEquipe) {
equipeRepository.deleteById(idEquipe);
    }
}
