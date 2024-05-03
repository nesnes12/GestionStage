package info2d.enicar.gestionStage.mappers;

import info2d.enicar.gestionStage.entities.EncadrantPedagogique;
import info2d.enicar.gestionStage.dtos.EncadrantPedagogiqueDTO;

import java.util.List;

public interface EncadrantPedagogiqueMapper {
    EncadrantPedagogiqueDTO toDTO(EncadrantPedagogique encadrantPedagogique);
    EncadrantPedagogique toEntity(EncadrantPedagogiqueDTO encadrantPedagogiqueDTO);
    List<EncadrantPedagogiqueDTO> toDTOList(List<EncadrantPedagogique> encadrantPedagogiques);
}