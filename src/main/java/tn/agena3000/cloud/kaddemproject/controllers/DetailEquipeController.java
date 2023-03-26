package tn.agena3000.cloud.kaddemproject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.agena3000.cloud.kaddemproject.entities.DetailEquipe;
import tn.agena3000.cloud.kaddemproject.services.IDetailEquipeService;

import java.util.List;

@RestController
@RequestMapping("detailequipe")
@RequiredArgsConstructor
public class DetailEquipeController {
    private final IDetailEquipeService iDetailEquipeServices;

    @GetMapping()
    public List<DetailEquipe> getAllDetailEquipe(){
        return iDetailEquipeServices.getAllDetailEquipe();
    }
    @GetMapping("{id}")
    public DetailEquipe getByIdDetailEquipe(@PathVariable int id){
        return iDetailEquipeServices.getById(id);
    }
    @DeleteMapping("{id}")
    private void deleteDetailEquipe(@PathVariable int id){
        iDetailEquipeServices.deleteDetailEquipe(id);
    }
    @PostMapping()
    public void ajouterDetailEquipe(@RequestBody DetailEquipe detailEquipe){
        iDetailEquipeServices.ajouterDetailEquipe(detailEquipe);
    }
    @PutMapping()
    private DetailEquipe updateDetailEquipe(@RequestBody DetailEquipe detailEquipe){
        iDetailEquipeServices.updateDetailEquipe(detailEquipe);
        return detailEquipe;
    }
}
