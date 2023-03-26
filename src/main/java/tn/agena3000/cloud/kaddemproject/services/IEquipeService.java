package tn.agena3000.cloud.kaddemproject.services;

import tn.agena3000.cloud.kaddemproject.entities.Equipe;

import java.util.List;

public interface IEquipeService {

    void ajouterEquipe(Equipe E);
    void updateEquipe(Equipe E);
    List<Equipe> getAllContrats();
    Equipe getById(Integer idEquipe);
    void deleteEquipe(Integer idEquipe);
}
