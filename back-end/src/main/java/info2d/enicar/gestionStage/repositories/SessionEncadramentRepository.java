package info2d.enicar.gestionStage.repositories;

import info2d.enicar.gestionStage.entities.SessionEncadrement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionEncadramentRepository extends JpaRepository<SessionEncadrement, Long> {

//    @Query("SELECT DISTINCT s.etudiant FROM Stage s JOIN s.livrables. se WHERE s.livrables.id = :encadrantId AND s.dateFin >= CURRENT_DATE")
//    List<Etudiant> findEtudiantsEnCoursByEncadrantId(@Param("encadrantId") Long encadrantId);
}