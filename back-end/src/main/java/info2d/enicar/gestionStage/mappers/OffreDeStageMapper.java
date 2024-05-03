package info2d.enicar.gestionStage.mappers;

import info2d.enicar.gestionStage.entities.OffreDeStage;
import info2d.enicar.gestionStage.dtos.OffreDeStageDTO;

import java.util.List;

public interface OffreDeStageMapper {
    OffreDeStageDTO offreDeStageToDTO(OffreDeStage offreDeStage);
    OffreDeStage DTOToOffreDeStage(OffreDeStageDTO dto);
    List<OffreDeStageDTO> offreDeStageListToDTOList(List<OffreDeStage> offreDeStages);
}