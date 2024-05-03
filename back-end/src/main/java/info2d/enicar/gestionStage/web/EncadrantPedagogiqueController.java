package info2d.enicar.gestionStage.web;

import info2d.enicar.gestionStage.dtos.EncadrantPedagogiqueDTO;
import info2d.enicar.gestionStage.services.EncadrantPedagogiqueService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/encadrant-pedagogique")
@CrossOrigin(origins = "*")
public class EncadrantPedagogiqueController {

    private final EncadrantPedagogiqueService encadrantPedagogiqueService;

    public EncadrantPedagogiqueController(EncadrantPedagogiqueService encadrantPedagogiqueService) {
        this.encadrantPedagogiqueService = encadrantPedagogiqueService;
    }

    @GetMapping
    public ResponseEntity<List<EncadrantPedagogiqueDTO>> getAllEncadrants() {
        List<EncadrantPedagogiqueDTO> encadrantPedagogiqueDTOs = encadrantPedagogiqueService.getAllEncadrants();
        return new ResponseEntity<>(encadrantPedagogiqueDTOs, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EncadrantPedagogiqueDTO> getEncadrantById(@PathVariable Long id) {
        EncadrantPedagogiqueDTO encadrantPedagogiqueDTO = encadrantPedagogiqueService.getEncadrantById(id);
        return new ResponseEntity<>(encadrantPedagogiqueDTO, HttpStatus.OK);
    }

}