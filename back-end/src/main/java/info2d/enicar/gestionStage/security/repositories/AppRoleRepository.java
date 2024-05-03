package info2d.enicar.gestionStage.security.repositories;
import info2d.enicar.gestionStage.security.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AppRoleRepository extends JpaRepository<AppRole, Long> {
    AppRole findAppRoleByRoleName(String username);
}