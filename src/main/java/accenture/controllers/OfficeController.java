package accenture.controllers;

import accenture.dto.OfficeDto;
import accenture.services.OfficeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/office")
public class OfficeController {

    private final OfficeService service;

    public OfficeController(OfficeService service) {
        this.service = service;
    }

    @GetMapping("/getAll")
    public List<OfficeDto> getAll() {
        return service.getAll();
    }

    @GetMapping("/countries/getAll")
    public List<String> getAllCountries() {
        return service.getAllCountries();
    }

    @GetMapping("/cities/getAll")
    public List<String> getAllCitiesByCountry(@RequestParam String country) {
        return service.getAllCitiesByCountry(country);
    }

    @GetMapping("/office/getAll")
    public List<String> getAllOfficesByCountry(@RequestParam String country) {
        return service.getAllOfficesByCountry(country);
    }
}
