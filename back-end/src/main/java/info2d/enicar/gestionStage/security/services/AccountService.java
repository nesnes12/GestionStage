package info2d.enicar.gestionStage.security.services;
import info2d.enicar.gestionStage.security.entities.AppRole;
import info2d.enicar.gestionStage.security.entities.AppUser;
import java.util.List;
public interface AccountService {
    AppUser addNewUser(AppUser appUser);
    AppRole addNewRole(AppRole appRole);
    void addRoleToUser(String username, String rolename);
    AppUser loadUserByUsername(String username);
    List<AppUser> listUsers();
}