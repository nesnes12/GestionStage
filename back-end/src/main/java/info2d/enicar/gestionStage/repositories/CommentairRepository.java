package info2d.enicar.gestionStage.repositories;

import info2d.enicar.gestionStage.entities.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentairRepository extends JpaRepository<Commentaire, Long> {
    List<Commentaire> findByLivrableId(Long livrableId);
}
