package info2d.enicar.gestionStage.services;

import java.util.List;

import info2d.enicar.gestionStage.dtos.ProjetDTO;

public interface ProjetService {
    ProjetDTO saveProjet(ProjetDTO projetDTO);

    List<ProjetDTO> getAllProjets();

    ProjetDTO getProjetById(Long id);

    ProjetDTO UpdateProjet(Long id, ProjetDTO projetDTO);

    void deleteProjet(Long id);

    List<ProjetDTO> ChercherProjetByIntitule(String intitule);
}
