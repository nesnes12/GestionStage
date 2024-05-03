package info2d.enicar.gestionStage.mappers;

import info2d.enicar.gestionStage.entities.Enseignant;
import info2d.enicar.gestionStage.dtos.EnseignantDTO;

import java.util.List;

public interface EnseignantMapper {
    public EnseignantDTO toDTO(Enseignant enseignant);
    public Enseignant toEntity(EnseignantDTO enseignantDTO);
    public List<EnseignantDTO> toDTOList(List<Enseignant> enseignants);

}