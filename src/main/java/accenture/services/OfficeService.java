package accenture.services;

import accenture.dto.OfficeDto;
import accenture.entity.Office;
import accenture.mapper.OfficeMapper;
import accenture.repositories.OfficeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfficeService {

    private final OfficeRepository repository;
    private final OfficeMapper mapper;

    public OfficeService(OfficeRepository repository, OfficeMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<OfficeDto> getAll() {
        return repository.findAll().stream()
                .map(mapper::map)
                .toList();
    }

    public List<String> getAllOfficesByCountry(String country) {
        return repository.findAllByCountry(country).stream().map(Office::getAddress).toList();
    }

    public List<String> getAllCitiesByCountry(String country) {
        return repository.findAllByCountry(country).stream()
                .map(Office::getCity)
                .distinct()
                .toList();
    }

    public List<String> getAllCountries() {
        return repository.findAll().stream()
                .map(Office::getCountry)
                .distinct()
                .toList();
    }
}
