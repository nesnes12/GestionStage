package info2d.enicar.gestionStage.dtos;

import info2d.enicar.gestionStage.entities.Annee_universitaire;
import info2d.enicar.gestionStage.entities.Entreprise;
import info2d.enicar.gestionStage.entities.Soutenance;
import lombok.Data;

import java.util.Date;

@Data
public class StageDTO {
    private Long id;
    private String titre;
    private String description;
    private String utite_d_accueil;
    private Date date_debut;
    private Date date_fin;
    private EtudiantDTO etudiantDTO;
    private Entreprise entreprise;
    private Annee_universitaire annee_univ;
    public Soutenance soutenance;
}
