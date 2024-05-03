package info2d.enicar.gestionStage.services;

import info2d.enicar.gestionStage.dtos.AdminDTO;
import info2d.enicar.gestionStage.entities.Admin;
import info2d.enicar.gestionStage.mappers.AdminMapper;
import info2d.enicar.gestionStage.repositories.AdminRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

@SpringBootTest
class AdminServiceImplTest {

    @Autowired
    private AdminServiceImpl adminService;

    @MockBean
    private AdminRepository adminRepository;

    @MockBean
    private AdminMapper adminMapper;

    @Test
    void getAdminById_Found() {
        Admin mockAdmin = new Admin();
        AdminDTO mockAdminDTO = new AdminDTO();
        Mockito.when(adminRepository.findById(1L)).thenReturn(Optional.of(mockAdmin));
        Mockito.when(adminMapper.adminToDTO(mockAdmin)).thenReturn(mockAdminDTO);

        AdminDTO result = adminService.getAdminById(1);
        assertEquals(mockAdminDTO, result);
    }

    @Test
    void getAdminById_NotFound() {
        Mockito.when(adminRepository.findById(1L)).thenReturn(Optional.empty());

        assertThrows(IllegalArgumentException.class, () -> adminService.getAdminById(1));
    }

    @Test
    void getAllAdmins_Success() {
        List<Admin> adminList = Arrays.asList(new Admin());
        List<AdminDTO> adminDTOList = Arrays.asList(new AdminDTO());
        Mockito.when(adminRepository.findAll()).thenReturn(adminList);
        Mockito.when(adminMapper.adminToDTO(any(Admin.class))).thenReturn(new AdminDTO());  // Simplifying the transformation

        List<AdminDTO> results = adminService.getAllAdmins();
        assertEquals(adminDTOList.size(), results.size());
    }

    @Test
    void getAllAdmins_Empty() {
        Mockito.when(adminRepository.findAll()).thenReturn(Collections.emptyList());

        List<AdminDTO> results = adminService.getAllAdmins();
        assertTrue(results.isEmpty());
    }

    @Test
    void getAdminByLogin_Found() {
        Admin mockAdmin = new Admin();
        AdminDTO mockAdminDTO = new AdminDTO();
        Mockito.when(adminRepository.findByLogin("user1")).thenReturn(mockAdmin);
        Mockito.when(adminMapper.adminToDTO(mockAdmin)).thenReturn(mockAdminDTO);

        AdminDTO result = adminService.getAdminByLogin("user1");
        assertEquals(mockAdminDTO, result);
    }

    @Test
    void getAdminByLogin_NotFound() {
        Mockito.when(adminRepository.findByLogin("user1")).thenReturn(null);

        assertThrows(IllegalArgumentException.class, () -> adminService.getAdminByLogin("user1"));
    }

    @Test
    void saveAdmin_New() {
        Admin adminToSave = new Admin();
        Admin savedAdmin = new Admin(); // assume it has an ID set after saving
        Mockito.when(adminRepository.save(adminToSave)).thenReturn(savedAdmin);

        Admin result = adminService.saveAdmin(adminToSave);
        assertNotNull(result);
    }

    @Test
    void saveAdmin_DTO() {
        AdminDTO adminDTO = new AdminDTO();
        Admin admin = new Admin();
        Mockito.when(adminMapper.DTOToAdmin(adminDTO)).thenReturn(admin);
        Mockito.when(adminRepository.save(admin)).thenReturn(admin);

        adminService.saveAdmin(adminDTO);
        Mockito.verify(adminRepository).save(admin);  // Check if the save method was called
    }
}