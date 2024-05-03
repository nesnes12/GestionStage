package info2d.enicar.gestionStage.services;

import info2d.enicar.gestionStage.dtos.StageDTO;


import java.util.List;

public interface StageService {
    public List<StageDTO> getStagesByEtudiantId(Long etudiantId);
    StageDTO saveStage(StageDTO stage);
}
