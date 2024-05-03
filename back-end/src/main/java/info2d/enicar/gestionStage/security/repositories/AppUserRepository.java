package info2d.enicar.gestionStage.security.repositories;
import info2d.enicar.gestionStage.security.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    AppUser findAppUserByUsername(String username);
}