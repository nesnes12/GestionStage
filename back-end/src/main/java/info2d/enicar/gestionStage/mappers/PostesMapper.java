package info2d.enicar.gestionStage.mappers;

import info2d.enicar.gestionStage.entities.Postes;
import info2d.enicar.gestionStage.dtos.PostesDTO;

public interface PostesMapper {
    PostesDTO fromPostes(Postes postes);
    Postes fromPostesDTO(PostesDTO postesDTO);
}
