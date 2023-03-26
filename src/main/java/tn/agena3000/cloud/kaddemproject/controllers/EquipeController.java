package tn.agena3000.cloud.kaddemproject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.agena3000.cloud.kaddemproject.entities.Equipe;
import tn.agena3000.cloud.kaddemproject.services.IEquipeService;

import java.util.List;

@RestController
@RequestMapping("equipe")
@RequiredArgsConstructor
public class EquipeController {
    @Autowired
    private final IEquipeService iEquipeServices;
    @GetMapping()
    public List<Equipe> getAllEquipe(){
        return iEquipeServices.getAllContrats();
    }
    @GetMapping("{id}")
    public Equipe getByIdEquipe(@PathVariable int id){
        return iEquipeServices.getById(id);
    }
    @DeleteMapping("{id}")
    private void deleteEquipe(@PathVariable int id){
        iEquipeServices.deleteEquipe(id);
    }
    @PostMapping()
    public void ajouterEquipe(@RequestBody Equipe equipe){
        iEquipeServices.ajouterEquipe(equipe);
    }
    @PutMapping()
    private Equipe updateEquipe(@RequestBody Equipe equipe){
        iEquipeServices.updateEquipe(equipe);
        return equipe;
    }
}
