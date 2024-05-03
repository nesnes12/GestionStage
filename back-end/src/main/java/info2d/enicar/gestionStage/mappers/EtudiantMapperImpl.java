package info2d.enicar.gestionStage.mappers;

import lombok.AllArgsConstructor;
import info2d.enicar.gestionStage.dtos.EtudiantDTO;
import info2d.enicar.gestionStage.entities.Etudiant;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EtudiantMapperImpl implements EtudiantMapper {
//    private  StageMapper mapper;
    @Override
    public EtudiantDTO fromEtudiant(Etudiant etudiant) {
        EtudiantDTO etudiantDTO=new EtudiantDTO();
        BeanUtils.copyProperties(etudiant,etudiantDTO);
//        etudiantDTO.setStage(mapper.fromStage(etudiant.getStage()));
        return etudiantDTO;
    }

    @Override
    public Etudiant fromEtudiantDTO(EtudiantDTO etudiantDTO) {
        Etudiant etudiant=new Etudiant();
        BeanUtils.copyProperties(etudiantDTO,etudiant);
//        etudiant.setStage(mapper.fromStageDTO(etudiantDTO.getStage()));
        return etudiant;
    }
}
