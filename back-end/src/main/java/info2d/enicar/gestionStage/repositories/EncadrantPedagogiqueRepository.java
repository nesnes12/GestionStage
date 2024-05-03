package info2d.enicar.gestionStage.repositories;

import info2d.enicar.gestionStage.entities.EncadrantPedagogique;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EncadrantPedagogiqueRepository extends JpaRepository<EncadrantPedagogique, Long> {
    List<EncadrantPedagogique> findByNomContainingIgnoreCase(String nom);
}