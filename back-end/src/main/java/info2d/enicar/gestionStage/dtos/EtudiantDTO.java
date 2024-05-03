package info2d.enicar.gestionStage.dtos;

import info2d.enicar.gestionStage.entities.Filiere;
import lombok.Data;

@Data
public class EtudiantDTO {
    private Long id;
    private String nom;
    private String prenom;
    private String username;
    private String password;
    private String email;
    private String CNE;
    private String CIN;
    private String telephone;
    private String adresse;
//    private StageDTO stage;
    private Filiere filiere;

}