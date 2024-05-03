package info2d.enicar.gestionStage.services;

import info2d.enicar.gestionStage.repositories.EncadrantPedagogiqueRepository;
import info2d.enicar.gestionStage.dtos.EncadrantPedagogiqueDTO;
import info2d.enicar.gestionStage.entities.EncadrantPedagogique;
import info2d.enicar.gestionStage.mappers.EncadrantPedagogiqueMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
public class EncadrantPedagogiqueServiceImpl implements EncadrantPedagogiqueService {

    private final EncadrantPedagogiqueRepository encadrantPedagogiqueRepository;
    private final EncadrantPedagogiqueMapper encadrantPedagogiqueMapper;

    public EncadrantPedagogiqueServiceImpl(EncadrantPedagogiqueRepository encadrantPedagogiqueRepository, EncadrantPedagogiqueMapper encadrantPedagogiqueMapper) {
        this.encadrantPedagogiqueRepository = encadrantPedagogiqueRepository;
        this.encadrantPedagogiqueMapper = encadrantPedagogiqueMapper;
    }

    @Override
    public List<EncadrantPedagogiqueDTO> getAllEncadrantsPedagogiques() {
        List<EncadrantPedagogique> encadrantsPedagogiques = encadrantPedagogiqueRepository.findAll();
        return encadrantPedagogiqueMapper.toDTOList(encadrantsPedagogiques);
    }

    @Override
    public EncadrantPedagogiqueDTO getEncadrantPedagogiqueById(Long id) {
        EncadrantPedagogique encadrantPedagogique = encadrantPedagogiqueRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("EncadrantPedagogique with id " + id + " not found"));
        return encadrantPedagogiqueMapper.toDTO(encadrantPedagogique);
    }

    @Override
    public EncadrantPedagogiqueDTO saveEncadrantPedagogique(EncadrantPedagogiqueDTO encadrantPedagogiqueDTO) {
        EncadrantPedagogique encadrantPedagogique = encadrantPedagogiqueMapper.toEntity(encadrantPedagogiqueDTO);
        encadrantPedagogique = encadrantPedagogiqueRepository.save(encadrantPedagogique);
        return encadrantPedagogiqueMapper.toDTO(encadrantPedagogique);
    }

    @Override
    public void deleteEncadrantPedagogiqueById(Long id) {
        encadrantPedagogiqueRepository.deleteById(id);
    }

    @Override
    public List<EncadrantPedagogiqueDTO> getAllEncadrants() {
        List<EncadrantPedagogique> encadrants = encadrantPedagogiqueRepository.findAll();
        return encadrants.stream()
                .map(encadrantPedagogiqueMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public EncadrantPedagogiqueDTO getEncadrantById(Long id) {
        EncadrantPedagogique encadrant = encadrantPedagogiqueRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Encadrant ID: " + id));
        return encadrantPedagogiqueMapper.toDTO(encadrant);
    }

}