package info2d.enicar.gestionStage.services;


import info2d.enicar.gestionStage.repositories.LivrableRepository;
import info2d.enicar.gestionStage.entities.Livrable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivrableServiceImp implements LivrableService {
    @Autowired
    private LivrableRepository livrableRepository;

    public List<Livrable> getLivrablesByStageId(Long stageId) {
        return livrableRepository.findByStageId(stageId);
    }
}
