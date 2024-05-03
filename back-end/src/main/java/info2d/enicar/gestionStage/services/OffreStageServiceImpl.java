package info2d.enicar.gestionStage.services;

import java.util.List;
import java.util.stream.Collectors;

import info2d.enicar.gestionStage.repositories.OffreStageRepository;
import org.slf4j.Logger;
import lombok.AllArgsConstructor;
import info2d.enicar.gestionStage.dtos.OffreStageDTO;
import info2d.enicar.gestionStage.dtos.OffreStageHistoryDTO;
import info2d.enicar.gestionStage.entities.OffreStage;
import info2d.enicar.gestionStage.mappers.OffreStageMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.slf4j.LoggerFactory;
@Service
@AllArgsConstructor

public class OffreStageServiceImpl implements OffreStageService {
    private OffreStageRepository offreStageRepository;
    private OffreStageMapper mapper;
    private static final Logger log = LoggerFactory.getLogger(OffreStageServiceImpl.class);

    public List<OffreStageDTO> findAllOffreStage() {
        List<OffreStage> offreStages = offreStageRepository.findAll();
        List<OffreStageDTO> offreStageDTOS = offreStages
                .stream()
                .map(offreStage -> mapper.fromOffreStage(offreStage))
                .collect(Collectors.toList()); //String to list
        return offreStageDTOS;
    }

    public OffreStageDTO findOffreStageById(Long id) {
        return mapper.fromOffreStage(offreStageRepository.findById(id).orElse(null));
    }

    public OffreStageDTO saveOffreStage(OffreStageDTO offreStageDTO) {
        OffreStage offreStage = mapper.fromOffreStageDTO(offreStageDTO);
        OffreStage save = offreStageRepository.save(offreStage);
        return mapper.fromOffreStage(save);
    }

    public OffreStageDTO UpdateOffreStage(Long id, OffreStageDTO offreStageDTO) {
        OffreStage offreStage = mapper.fromOffreStageDTO(offreStageDTO);
        return mapper.fromOffreStage(offreStageRepository.save(offreStage));
        /*
        Optional<OffreStage> optionalOffreStage = offreStageRepository.findById(id);
        if (optionalOffreStage.isPresent()) {
            OffreStage offreStage = optionalOffreStage.get();
            offreStage.setPoste(NewoffreStage.getPoste());
            offreStage.setEntreprise(NewoffreStage.getEntreprise());
            offreStage.setDescription(NewoffreStage.getDescription());
            offreStage.setDateDebut(NewoffreStage.getDateDebut());
            offreStage.setDateFin(NewoffreStage.getDateFin());
            offreStage.setTechnologie(NewoffreStage.getTechnologie());
            return offreStageRepository.save(offreStage);
        } else {
            return null;
        }
         */
    }

    public void deleteOffreStageById(Long id) {
        offreStageRepository.deleteById(id);
    }

    public List<OffreStageDTO> ChercherOffreStageByPoste(String poste) {
        List<OffreStage> offreStages = offreStageRepository.searchOffreStageByPoste(poste);
        List<OffreStageDTO> offreStageDTOS = offreStages
                .stream()
                .map(offreStage -> mapper.fromOffreStage(offreStage))
                .collect(Collectors.toList());
        //log.info("Offre stages: {}", offreStageDTOS.toString());


        //String to list
        return offreStageDTOS;
    }

    public List<OffreStageDTO> ChercherOffreStageByEntreprise(String entreprise) {
        List<OffreStage> offreStages = offreStageRepository.searchOffreStageByEntreprise(entreprise);
        List<OffreStageDTO> offreStageDTOS = offreStages
                .stream()
                .map(offreStage -> mapper.fromOffreStage(offreStage))
                .collect(Collectors.toList()); //String to list

        return offreStageDTOS;
    }

    public List<OffreStageDTO> ChercherOffreStageByTechnologie(String technologie) {
        List<OffreStage> offreStages = offreStageRepository.searchOffreStageByTechnologie(technologie);
        List<OffreStageDTO> offreStageDTOS = offreStages
                .stream()
                .map(offreStage -> mapper.fromOffreStage(offreStage))
                .collect(Collectors.toList()); //String to list
        return offreStageDTOS;
    }

    @Override
    public OffreStageHistoryDTO getOffreStageHistory(Long id, int page, int size) {
        OffreStage offreStage = offreStageRepository.findById(id).orElse(null);
        Page<OffreStage> offreStageById = offreStageRepository.findOffreStageById(id, PageRequest.of(page, size));

        OffreStageHistoryDTO offreStageHistoryDTO = new OffreStageHistoryDTO();
        List<OffreStageDTO> accountOperationDTOS = offreStageById
                .getContent()
                .stream()
                .map(
                        accountOperation -> mapper.fromOffreStage(accountOperation)
                )
                .collect(Collectors.toList());
        offreStageHistoryDTO.setOffreStageDTOS(accountOperationDTOS);
        offreStageHistoryDTO.setId(offreStage.getId());
        offreStageHistoryDTO.setSizePage(size);
        offreStageHistoryDTO.setTotalPage(offreStageById.getTotalPages());
        offreStageHistoryDTO.setCurrentPage(page);
        return offreStageHistoryDTO;
    }


}
