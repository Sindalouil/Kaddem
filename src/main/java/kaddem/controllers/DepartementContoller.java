package kaddem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import kaddem.entities.Departement;
import kaddem.entities.Equipe;
import kaddem.services.IDepartementServices;
import kaddem.services.IEquipeServices;

import java.util.List;

@RestController
public class DepartementContoller{

    @Autowired
    private IDepartementServices iDepartementServices;

    @GetMapping("/getAllDepartement")
    public List<Departement> getAllDepartement(){
        return iDepartementServices.getAllDepartement();
    }
    @GetMapping("/getByIdDepartement/{id}")
    public Departement getByIdDepartement(@PathVariable int id){
        return iDepartementServices.getByIdDepartement(id);
    }
    @DeleteMapping("/deleteDepartement/{id}")
    private void deleteDepartement(@PathVariable int id){
        iDepartementServices.deleteDepartement(id);
    }
    @PostMapping("/ajouterDepartement")
    public void ajouterDepartement(@RequestBody Departement departement){
        iDepartementServices.ajouterDepartement(departement);
    }
    @PutMapping("/updateDepartement")
    private Departement updateDepartement(@RequestBody Departement departement){
        iDepartementServices.updateDepartement(departement);
        return departement;
    }
}
