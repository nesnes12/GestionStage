package info2d.enicar.gestionStage.web;

import info2d.enicar.gestionStage.dtos.ProjetDTO;
import info2d.enicar.gestionStage.services.ProjetService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/projets")
@CrossOrigin("*")
public class ProjetController {
    private ProjetService projetService;

    @GetMapping("/all")
    public List<ProjetDTO> getAllProjet(){
        return projetService.getAllProjets();
    }

    @GetMapping("/{id}")
    public ProjetDTO getProjet(@PathVariable(name = "id") Long id){
        return projetService.getProjetById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProjet(@PathVariable Long id){
        projetService.deleteProjet(id);
    }

    @PutMapping("/edit/{id}")
    public ProjetDTO editProjet(@PathVariable Long id, @RequestBody ProjetDTO  projetDTO){
        projetDTO.setId(id);
        return projetService.UpdateProjet(id,projetDTO);
    }

    @PostMapping("/new-projet")
    public ProjetDTO newProjet(@RequestBody ProjetDTO projet){
        return projetService.saveProjet(projet);
    }

    @GetMapping("/intitule/{intitule}")
    public List<ProjetDTO> searchProjetByIntitule(@PathVariable String intitule){
        return projetService.ChercherProjetByIntitule(intitule);
    }

    @GetMapping("/intitule/search")
    public List<ProjetDTO> searchProjetsByIntitule(@RequestParam(defaultValue = "") String intitule){
        return projetService.ChercherProjetByIntitule(intitule);
    }

}
