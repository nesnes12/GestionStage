package info2d.enicar.gestionStage.mappers;

import info2d.enicar.gestionStage.entities.OffreStage;
import info2d.enicar.gestionStage.dtos.OffreStageDTO;

public interface OffreStageMapper {
    OffreStageDTO fromOffreStage(OffreStage offreStage);
    OffreStage fromOffreStageDTO(OffreStageDTO offreStageDTO);
}
