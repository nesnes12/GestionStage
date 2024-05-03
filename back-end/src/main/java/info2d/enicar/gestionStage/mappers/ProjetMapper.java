package info2d.enicar.gestionStage.mappers;

import info2d.enicar.gestionStage.entities.Projet;
import info2d.enicar.gestionStage.dtos.ProjetDTO;

public interface ProjetMapper {
    ProjetDTO fromProjet(Projet projet);
    Projet fromProjetDTO(ProjetDTO projetDTO);
}
