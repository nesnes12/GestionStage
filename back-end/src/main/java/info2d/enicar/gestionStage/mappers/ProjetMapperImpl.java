package info2d.enicar.gestionStage.mappers;

import info2d.enicar.gestionStage.entities.Projet;
import lombok.AllArgsConstructor;
import info2d.enicar.gestionStage.dtos.ProjetDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProjetMapperImpl implements ProjetMapper {
    private StageMapper mapper;
    @Override
    public ProjetDTO fromProjet(Projet projet) {
        ProjetDTO projetDTO=new ProjetDTO();
        BeanUtils.copyProperties(projet, projetDTO);
        projetDTO.setStageDTO(mapper.fromStage(projet.getStage()));
        return projetDTO;
    }

    @Override
    public Projet fromProjetDTO(ProjetDTO projetDTO) {
        Projet projet=new Projet();
        BeanUtils.copyProperties(projetDTO, projet);
        projet.setStage(mapper.fromStageDTO(projetDTO.getStageDTO()));
        return projet;
    }

}
