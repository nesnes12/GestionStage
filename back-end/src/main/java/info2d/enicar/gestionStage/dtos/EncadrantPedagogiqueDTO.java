package info2d.enicar.gestionStage.dtos;

import info2d.enicar.gestionStage.entities.SessionEncadrement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EncadrantPedagogiqueDTO {
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String CNE;
    private String codeApogee;
    private String username;
    private String password;
    private List<SessionEncadrement> sessionEncadrement;
}