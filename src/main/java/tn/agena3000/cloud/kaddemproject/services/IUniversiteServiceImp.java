package tn.agena3000.cloud.kaddemproject.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tn.agena3000.cloud.kaddemproject.entities.Contrat;
import tn.agena3000.cloud.kaddemproject.entities.Departement;
import tn.agena3000.cloud.kaddemproject.entities.Etudiant;
import tn.agena3000.cloud.kaddemproject.entities.Universite;
import tn.agena3000.cloud.kaddemproject.repositories.ContratRespository;
import tn.agena3000.cloud.kaddemproject.repositories.EtudiantRepository;
import tn.agena3000.cloud.kaddemproject.repositories.UniversiteRepository;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class IUniversiteServiceImp implements IUniversiteService{
    private  UniversiteRepository universiteRepository;
    private EtudiantRepository etudiantRepository;
    private ContratRespository contratRespository;
    @Override
    public void ajouterUniversite(Universite universite) {
universiteRepository.save(universite);
    }

    @Override
    public void updateUniversite(Universite universite) {
universiteRepository.save(universite);
    }

    @Override
    public List<Universite> getAllUniversite() {

        return universiteRepository.findAll();
    }

    @Override
    public Universite getById(Integer idUniversite) {
        return universiteRepository.findById(idUniversite).orElse(null);
    }

    @Override
    public void deleteUniversite(Integer idUniversite) {
universiteRepository.deleteById(idUniversite);
    }

    @Override
    public List<Departement> retrieveDepartementsByUniversite(Integer idUniversite) {
        Universite universite = universiteRepository.findById(idUniversite).orElse(null);
        Assert.isNull(universite,"No such universite");
        return  universite.getDepartements();
    }

    @Override
    public Map<String, Float> getMontantContartEntreDeuxDate(int idUniv, LocalDate startDate, LocalDate endDate) {
        Universite universite = universiteRepository.findById(idUniv).orElse(null);
       List<Departement> d = universite.getDepartements();
        List<Etudiant> e = new ArrayList<>();
        List<Contrat> contratList = new ArrayList<>();
        for (Departement depart: d) {
            e.addAll(depart.getEtudiants());
        }
        for (Etudiant etud: e) {
            List<Contrat> contrats = contratRespository.findByEtudiant(etud);
            contratList.addAll(contrats);
        }
        Map<String, Float> map = new HashMap<>();
       List<Contrat> List_filtre = contratList.stream().filter(contrat -> !(contrat.getDateFinContrat().isBefore(startDate) && contrat.getDateDebutContrat().isAfter(endDate))).toList();
       map = List_filtre.stream().collect(Collectors.groupingBy(Contrat->Contrat.getSpecialite(),Collectors.summingDouble(Contrat::getMontantContrat))).entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey,e->e.getValue().floatValue()));







    }

}
