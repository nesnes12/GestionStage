package info2d.enicar.gestionStage.services;

import info2d.enicar.gestionStage.entities.Livrable;

import java.util.List;

public interface LivrableService {
    List<Livrable> getLivrablesByStageId(Long stageId);
}
