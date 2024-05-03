package info2d.enicar.gestionStage.mappers;

import info2d.enicar.gestionStage.entities.Admin;
import info2d.enicar.gestionStage.dtos.AdminDTO;

public interface AdminMapper {
    AdminDTO adminToDTO(Admin admin);
    Admin DTOToAdmin(AdminDTO adminDTO);
}