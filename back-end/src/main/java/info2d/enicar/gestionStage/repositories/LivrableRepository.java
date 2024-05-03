package info2d.enicar.gestionStage.repositories;

import info2d.enicar.gestionStage.entities.Livrable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivrableRepository extends JpaRepository<Livrable, Long> {
        List<Livrable> findByStageId(Long stageId);
    }

