package tn.agena3000.cloud.kaddemproject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.agena3000.cloud.kaddemproject.entities.Departement;
import tn.agena3000.cloud.kaddemproject.entities.Etudiant;
import tn.agena3000.cloud.kaddemproject.services.IDepartementService;

import java.util.List;

@RestController
@RequestMapping("departement")
@RequiredArgsConstructor

public class DepartementController {
    private final IDepartementService iDepartementServices;

    @GetMapping()
    public List<Departement> getAllDepartement(){
        return iDepartementServices.getAllDepartement();
    }
    @GetMapping("{id}")
    public Departement getByIdDepartement(@PathVariable int id){
        return iDepartementServices.getById(id);
    }
    @DeleteMapping("{id}")
    private void deleteDepartement(@PathVariable int id){
        iDepartementServices.deleteDepartement(id);
    }
    @PostMapping()
    public void ajouterDepartement(@RequestBody Departement departement){
        iDepartementServices.ajouterDepartement(departement);
    }
    @PutMapping()
    private Departement updateDepartement(@RequestBody Departement departement){
        iDepartementServices.updateDepartement(departement);
        return departement;
    }
    @PutMapping("/{idUniversite}/{idDepartement}")
    public void assignUniversiteToDepartement(@PathVariable Integer idUniversite, @PathVariable Integer
            idDepartement){
  iDepartementServices.assignUniversiteToDepartement(idUniversite,idDepartement);
    }
    @GetMapping("idDepartement}")
    public List<Etudiant> getEtudiantsByDepartement(Integer idDepartement) {
        return iDepartementServices.getEtudiantsByDepartement(idDepartement);
    }
}
