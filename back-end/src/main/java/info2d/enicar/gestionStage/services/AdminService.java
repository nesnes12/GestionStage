package info2d.enicar.gestionStage.services;

import info2d.enicar.gestionStage.dtos.AdminDTO;
import info2d.enicar.gestionStage.entities.Admin;

import java.util.List;

public interface AdminService {
    AdminDTO getAdminById(int id);
    List<AdminDTO> getAllAdmins();
    AdminDTO getAdminByLogin(String login);
    Admin saveAdmin(Admin admin);
    void saveAdmin(AdminDTO adminDTO);
}