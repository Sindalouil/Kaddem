package kaddem.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import kaddem.entities.Departement;
import kaddem.entities.DetailEquipe;
import kaddem.services.IDepartementServices;
import kaddem.services.IDetailEquipeServices;

import java.util.List;

@RestController
public class DetailEquipeController{

    @Autowired
    private IDetailEquipeServices iDetailEquipeServices;

    @GetMapping("/getAllDetailEquipe")
    public List<DetailEquipe> getAllDetailEquipe(){
        return iDetailEquipeServices.getAllDetailEquipe();
    }
    @GetMapping("/getByIdDetailEquipe/{id}")
    public DetailEquipe getByIdDetailEquipe(@PathVariable int id){
        return iDetailEquipeServices.getByIdDetailEquipe(id);
    }
    @DeleteMapping("/deleteDetailEquipe/{id}")
    private void deleteDetailEquipe(@PathVariable int id){
        iDetailEquipeServices.deleteDetailEquipe(id);
    }
    @PostMapping("/ajouterDetailEquipe")
    public void ajouterDetailEquipe(@RequestBody DetailEquipe detailEquipe){
        iDetailEquipeServices.ajouterDetailEquipe(detailEquipe);
    }
    @PutMapping("/updateDetailEquipe")
    private DetailEquipe updateDetailEquipe(@RequestBody DetailEquipe detailEquipe){
        iDetailEquipeServices.updateDetailEquipe(detailEquipe);
        return detailEquipe;
    }
}
