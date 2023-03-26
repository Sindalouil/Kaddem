package tn.agena3000.cloud.kaddemproject.services;

import tn.agena3000.cloud.kaddemproject.entities.DetailEquipe;

import java.util.List;

public interface IDetailEquipeService {
    void ajouterDetailEquipe(DetailEquipe detailEquipe);
    void updateDetailEquipe(DetailEquipe detailEquipe);
    List<DetailEquipe> getAllDetailEquipe();
    DetailEquipe getById(Integer idDetailEquipe);
    void deleteDetailEquipe(Integer idDetailEquipe);
}
