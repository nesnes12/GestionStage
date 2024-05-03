package info2d.enicar.gestionStage.services;

import info2d.enicar.gestionStage.dtos.OffreDeStageDTO;
import info2d.enicar.gestionStage.dtos.OffreDeStageDetailsDTO;
import info2d.enicar.gestionStage.entities.OffreDeStage;

import java.util.Date;
import java.util.List;

public interface OffreDeStageService {
    List<OffreDeStageDTO> getAllOffreDeStages();
    OffreDeStageDTO getOffreDeStageById(Long id);
    OffreDeStageDetailsDTO getOffreDeStageDetailsById(Long id);
    OffreDeStageDTO createOffreDeStage(OffreDeStageDTO offreDeStageDTO);
    OffreDeStageDTO updateOffreDeStage(Long id, OffreDeStageDTO offreDeStageDTO);
    void deleteOffreDeStage(Long id);
    List<OffreDeStageDTO> searchOffreDeStages(String keyword);
    List<OffreDeStageDTO> filterOffreDeStagesByDate(Date date);
    OffreDeStageDTO validateOffreDeStage(Long id);
    List<OffreDeStageDTO> getOffreDeStagesByEntreprise(String entreprise);
    OffreDeStage saveOffreDeStage(OffreDeStage offreDeStage);
    void saveOffreDeStage(OffreDeStageDTO offreDeStageDTO);
    List<OffreDeStageDTO> getNonValidatedOffers();


}