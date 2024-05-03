package info2d.enicar.gestionStage.repositories;

import info2d.enicar.gestionStage.entities.OffreDeStage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface OffreDeStageRepository extends JpaRepository<OffreDeStage, Long> {
    List<OffreDeStage> findByPoste(String poste);
    List<OffreDeStage> searchOffreDeStageByEntreprise(String entreprise);
    List<OffreDeStage> findByTechnologie(String technologie);
    List<OffreDeStage> findByDateDebutGreaterThanEqual(Date date);
    List<OffreDeStage> findByDateFinLessThanEqual(Date date);
    List<OffreDeStage> findByPosteContainingIgnoreCase(String keyword);
    List<OffreDeStage> findByEntrepriseIgnoreCase(String entreprise);
    List<OffreDeStage> findByValidatedFalse();

    List<OffreDeStage>searchOffreStageByPoste( String poste);
}