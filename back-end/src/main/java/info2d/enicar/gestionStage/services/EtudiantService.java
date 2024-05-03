package info2d.enicar.gestionStage.services;

import java.util.List;

import info2d.enicar.gestionStage.dtos.EtudiantDTO;

public interface EtudiantService {
    EtudiantDTO createEtudiant(EtudiantDTO etudiantDTO);
    List<EtudiantDTO> getAllEtudiants();
    EtudiantDTO getEtudiantById(Long id);
    EtudiantDTO updateEtudiant(Long id, EtudiantDTO newEtudiantDTO);
    void deleteEtudiantById(Long id);
    EtudiantDTO ChercherEtudiantByCNE(String cne);
}
