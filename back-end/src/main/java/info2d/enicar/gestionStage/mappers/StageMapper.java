package info2d.enicar.gestionStage.mappers;

import info2d.enicar.gestionStage.entities.Stage;
import info2d.enicar.gestionStage.dtos.StageDTO;

public interface StageMapper {
    StageDTO fromStage(Stage stage);
    Stage fromStageDTO(StageDTO stageDTO);
}
