package info2d.enicar.gestionStage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import info2d.enicar.gestionStage.entities.Stage;

@Repository
public interface StageRepository extends JpaRepository<Stage, Long> {

}
