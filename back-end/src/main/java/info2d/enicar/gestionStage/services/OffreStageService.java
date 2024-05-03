package info2d.enicar.gestionStage.services;

import java.util.List;

import info2d.enicar.gestionStage.dtos.OffreStageDTO;
import info2d.enicar.gestionStage.dtos.OffreStageHistoryDTO;

public interface OffreStageService {
    List<OffreStageDTO> findAllOffreStage();
    OffreStageDTO findOffreStageById(Long id);
    OffreStageDTO saveOffreStage(OffreStageDTO offreStageDTO);
    OffreStageDTO UpdateOffreStage(Long id, OffreStageDTO offreStageDTO);
    void deleteOffreStageById(Long id);
    List<OffreStageDTO> ChercherOffreStageByPoste(String poste);
    List<OffreStageDTO> ChercherOffreStageByEntreprise(String entreprise);
    List<OffreStageDTO> ChercherOffreStageByTechnologie(String technologie);

    OffreStageHistoryDTO getOffreStageHistory(Long id, int page, int size);
}
