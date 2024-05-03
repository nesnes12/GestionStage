package info2d.enicar.gestionStage.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnseignantDTO {
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private  String CNE;
    private String codeApogee;
    private  String username;
    private String password;
    private boolean responsableFiliere;
    private boolean responsableDepartement;
    private FiliereDTO filiereDTO;
    private DepartementDTO departementDTO;
}