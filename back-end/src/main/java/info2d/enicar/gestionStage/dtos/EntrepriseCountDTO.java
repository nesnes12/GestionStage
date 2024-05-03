package info2d.enicar.gestionStage.dtos;
import info2d.enicar.gestionStage.entities.Entreprise;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EntrepriseCountDTO {
    private Entreprise enterprise;
    private Long count;
}