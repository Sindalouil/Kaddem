package tn.agena3000.cloud.kaddemproject.services;

import tn.agena3000.cloud.kaddemproject.entities.Departement;
import tn.agena3000.cloud.kaddemproject.entities.Universite;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface IUniversiteService {
    void ajouterUniversite(Universite universite);
    void updateUniversite(Universite universite);
    List<Universite> getAllUniversite();
    Universite getById(Integer idUniversite);
    void deleteUniversite(Integer idUniversite);
    List<Departement> retrieveDepartementsByUniversite(Integer idUniversite);

    Map<String,Float> getMontantContartEntreDeuxDate(int idUniv, Date startDate, Date endDate);

}
