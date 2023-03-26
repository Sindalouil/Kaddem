package tn.agena3000.cloud.kaddemproject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.agena3000.cloud.kaddemproject.entities.Contrat;
import tn.agena3000.cloud.kaddemproject.services.IContratServices;

import java.util.List;

@RestController
@RequestMapping("contrat")
@RequiredArgsConstructor
public class ContratController {
    private IContratServices iContratServices;

    @GetMapping()
    public List<Contrat> getAllContrat(){
        return iContratServices.getAllContrats();
    }
    @GetMapping("/{id}")
    public Contrat getByIdContrat(@PathVariable int id){
        return iContratServices.getById(id);
    }
    @DeleteMapping("/{id}")
    private void deleteContrat(@PathVariable int id){
        iContratServices.deleteContrat(id);
    }
    @PostMapping()
    public void ajouterContrat(@RequestBody Contrat contrat){
        iContratServices.ajouterContrat(contrat);
    }
    @PutMapping()
    private Contrat updateContrat(@RequestBody Contrat contrat){
        iContratServices.updateContrat(contrat);
        return contrat;
    }

    @PostMapping("/{ce}/{nomE}/{prenomE}")
    public Contrat affectContratToEtudiant(@PathVariable Contrat ce, @PathVariable String nomE, @PathVariable String prenomE){
        iContratServices.affectContratToEtudiant(ce,nomE,prenomE);
        return ce;
    }


}
