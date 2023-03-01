package kaddem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import kaddem.entities.Equipe;
import kaddem.entities.Etudiant;
import kaddem.services.IEquipeServices;

import java.util.List;

@RestController
public class EquipeController {

    @Autowired
    IEquipeServices iEquipeServices;
    @GetMapping("/getAllEquipe")
    public List<Equipe> getAllEquipe(){
        return iEquipeServices.getAllEquipe();
    }
    @GetMapping("/getByIdEquipe/{id}")
    public Equipe getByIdEquipe(@PathVariable int id){
        return iEquipeServices.getByIdEquipe(id);
    }
    @DeleteMapping("/deleteEquipe/{id}")
    private void deleteEquipe(@PathVariable int id){
        iEquipeServices.deleteEquipe(id);
    }
    @PostMapping("/ajouterEquipe")
    public void ajouterEquipe(@RequestBody Equipe equipe){
        iEquipeServices.ajouterEquipe(equipe);
    }
    @PutMapping("/updateEquipe")
    private Equipe updateEquipe(@RequestBody Equipe equipe){
        iEquipeServices.updateEquipe(equipe);
        return equipe;
    }
}
