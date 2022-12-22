package accenture.controllers;

import accenture.dto.ReservationDto;
import accenture.services.DeskService;
import accenture.services.ReservationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

    private final ReservationService service;
    private final DeskService deskService;

    public ReservationController(ReservationService service, DeskService deskService) {
        this.service = service;
        this.deskService = deskService;
    }

    @GetMapping("/getAll")
    public List<ReservationDto> getAllReservationByOfficeAddress(@RequestParam String address) {
        return service.getAllReservationByOfficeAddress(address);
    }

    @PostMapping("/getAll")
    public ReservationDto postReservation(@RequestParam ReservationDto reservation) {
        return service.createNewReservation(reservation);
    }

}
