package info2d.enicar.gestionStage.repositories;

import info2d.enicar.gestionStage.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    Etudiant searchEtudiantByCNE(String cne);
}
