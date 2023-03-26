package tn.agena3000.cloud.kaddemproject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.agena3000.cloud.kaddemproject.entities.Departement;
import tn.agena3000.cloud.kaddemproject.entities.Universite;
import tn.agena3000.cloud.kaddemproject.services.IUniversiteService;

import java.util.List;

@RestController
@RequestMapping("universite")
@RequiredArgsConstructor
public class UniversiteController {
    private final IUniversiteService iUniversiteServices;

    @GetMapping("/getAllUniversite")
    public List<Universite> getAllUniversite(){
        return iUniversiteServices.getAllUniversite();
    }
    @GetMapping("/getByIdUniversite/{id}")
    public Universite getByIdUniversite(@PathVariable int id){
        return iUniversiteServices.getById(id);
    }
    @DeleteMapping("/DeleteUniversite/{id}")
    public void deleteUniversite(@PathVariable int id){
        iUniversiteServices.deleteUniversite(id);
    }
    @PostMapping("ajoutUniversite")
    public void ajoutUniversite(@RequestBody Universite universite){
        iUniversiteServices.ajouterUniversite(universite);
    }
    @PutMapping("/updateUniversite")
    public Universite updateUniversite(@RequestBody Universite universite){
        iUniversiteServices.updateUniversite(universite);
        return universite;
    }
    @GetMapping("{idUniversite}")
    public List<Departement> retrieveDepartementsByUniversite(Integer idUniversite){
        return iUniversiteServices.retrieveDepartementsByUniversite(idUniversite);
    }
}
