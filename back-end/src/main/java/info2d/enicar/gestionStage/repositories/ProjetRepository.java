package info2d.enicar.gestionStage.repositories;

import java.util.List;
import info2d.enicar.gestionStage.entities.Projet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetRepository extends JpaRepository<Projet, Long> {
    List<Projet> searchEtudiantByIntitule(String intitule);
}
