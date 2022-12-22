package accenture.services;

import accenture.dto.DeskDto;
import accenture.entity.Desk;
import accenture.mapper.DeskMapper;
import accenture.repositories.DeskRepository;
import accenture.repositories.OfficeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeskService {

    private final DeskRepository repository;
    private final OfficeRepository officeRepository;
    private final DeskMapper deskMapper;

    public DeskService(DeskRepository repository, OfficeRepository officeRepository, DeskMapper deskMapper) {
        this.repository = repository;
        this.officeRepository = officeRepository;
        this.deskMapper = deskMapper;
    }

    public List<DeskDto> getAllDeskDtoByOffice(String address) {
        return getAllDeskByOffice(address)
                .stream()
                .map(deskMapper::map)
                .toList();
    }

    public List<Desk> getAllDeskByOffice(String address) {
        return officeRepository.findOfficeByAddress(address)
                .getDesks();
    }
}
