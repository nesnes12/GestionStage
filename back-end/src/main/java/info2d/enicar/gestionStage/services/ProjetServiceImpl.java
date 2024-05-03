package info2d.enicar.gestionStage.services;

import java.util.List;
import java.util.stream.Collectors;

import info2d.enicar.gestionStage.repositories.ProjetRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import info2d.enicar.gestionStage.dtos.ProjetDTO;
import info2d.enicar.gestionStage.entities.Projet;
import info2d.enicar.gestionStage.mappers.ProjetMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class ProjetServiceImpl implements ProjetService {
    private ProjetRepository projetRepository;
    private ProjetMapper mapper;

    public ProjetDTO saveProjet(ProjetDTO projetDTO) {
        Projet projet=mapper.fromProjetDTO(projetDTO);
        return mapper.fromProjet(projetRepository.save(projet));
    }

    public List<ProjetDTO> getAllProjets() {
        List<Projet> etudiants = projetRepository.findAll();
        List<ProjetDTO> projetDTOS = etudiants
                .stream()
                .map(projet -> mapper.fromProjet(projet))
                .collect(Collectors.toList()); //String to list
        return projetDTOS;
    }

    public ProjetDTO getProjetById(Long id) {
        return mapper.fromProjet(projetRepository.findById(id).orElse(null));
    }

    public ProjetDTO UpdateProjet(Long id, ProjetDTO projetDTO) {
        Projet projet = mapper.fromProjetDTO(projetDTO);
        return mapper.fromProjet(projetRepository.save(projet));
    }

    public void deleteProjet(Long id) {
        projetRepository.deleteById(id);
    }

    public List<ProjetDTO> ChercherProjetByIntitule(String intitule) {
        List<Projet> projets = projetRepository.searchEtudiantByIntitule(intitule);
        List<ProjetDTO> projetDTOS = projets
                .stream()
                .map(projet -> mapper.fromProjet(projet))
                .collect(Collectors.toList()); //String to list
        return projetDTOS;
    }

}
