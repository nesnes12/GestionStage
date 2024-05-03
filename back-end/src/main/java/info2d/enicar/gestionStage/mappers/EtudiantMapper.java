package info2d.enicar.gestionStage.mappers;

import info2d.enicar.gestionStage.entities.Etudiant;
import info2d.enicar.gestionStage.dtos.EtudiantDTO;

public interface EtudiantMapper {
    EtudiantDTO fromEtudiant(Etudiant etudiant);
    Etudiant fromEtudiantDTO(EtudiantDTO etudiantDTO);
}
