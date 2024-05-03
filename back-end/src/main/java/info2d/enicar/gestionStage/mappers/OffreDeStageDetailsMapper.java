package info2d.enicar.gestionStage.mappers;

import info2d.enicar.gestionStage.entities.OffreDeStage;
import info2d.enicar.gestionStage.dtos.OffreDeStageDetailsDTO;

public interface OffreDeStageDetailsMapper {
    OffreDeStageDetailsDTO offreDeStageToDetailsDTO(OffreDeStage offreDeStage);
}
