package info2d.enicar.gestionStage.mappers;

import info2d.enicar.gestionStage.entities.Postes;
import lombok.AllArgsConstructor;
import info2d.enicar.gestionStage.dtos.PostesDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PostesMapperImpl implements PostesMapper {
    @Override
    public PostesDTO fromPostes(Postes postes) {
        PostesDTO postesDTO=new PostesDTO();
        BeanUtils.copyProperties(postes, postesDTO);
        return postesDTO;
    }
    @Override
    public Postes fromPostesDTO(PostesDTO postesDTO) {
        Postes postes=new Postes();
        BeanUtils.copyProperties(postesDTO, postes);
        return postes;
    }

}
