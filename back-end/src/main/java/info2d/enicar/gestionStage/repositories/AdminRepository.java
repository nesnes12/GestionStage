package info2d.enicar.gestionStage.repositories;

import info2d.enicar.gestionStage.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByLogin(String login);
}