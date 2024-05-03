package info2d.enicar.gestionStage.repositories;

import info2d.enicar.gestionStage.entities.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EnseignantRepository extends JpaRepository<Enseignant, Long> {
    List<Enseignant> findByResponsableFiliere(boolean responsableFiliere);
    List<Enseignant> findByResponsableDepartement(boolean responsableDepartement);
    List<Enseignant> findByNomContainingIgnoreCase(String nom);
}