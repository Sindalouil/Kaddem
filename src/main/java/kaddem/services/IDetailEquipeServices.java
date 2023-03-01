package kaddem.services;

import kaddem.entities.Departement;
import kaddem.entities.DetailEquipe;

import java.util.List;

public interface IDetailEquipeServices {
    void ajouterDetailEquipe(DetailEquipe de);
    void updateDetailEquipe(DetailEquipe de);
    List<DetailEquipe> getAllDetailEquipe();
    DetailEquipe getByIdDetailEquipe(Integer id);
    void deleteDetailEquipe(Integer id);
}
