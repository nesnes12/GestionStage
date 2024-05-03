package info2d.enicar.gestionStage.dtos;

import info2d.enicar.gestionStage.entities.Admin;
import lombok.Data;

import java.util.Date;

@Data
public class OffreStageDTO {
    private Long id;
    private String poste;
    private String entreprise;
    private String description;
    private Date dateDebut;
    private Date dateFin;
    private String technologie;
    private Admin admin;
    private EtudiantDTO etudiantDTO;
}
