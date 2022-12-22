package accenture.controllers;

import accenture.dto.DeskDto;
import accenture.entity.Desk;
import accenture.services.DeskService;
import accenture.services.ReservationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/desk")
public class DeskController {

    private final ReservationService reservationService;
    private final DeskService deskService;

    public DeskController(ReservationService reservationService, DeskService deskService) {
        this.reservationService = reservationService;
        this.deskService = deskService;
    }

    @GetMapping("/getAll")
    public List<DeskDto> getAllDeskByOffice(@RequestParam String address) {
        return deskService.getAllDeskDtoByOffice(address);
    }
}
