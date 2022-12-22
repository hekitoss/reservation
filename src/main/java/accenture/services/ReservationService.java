package accenture.services;

import accenture.dto.ReservationDto;
import accenture.entity.Reservation;
import accenture.mapper.ReservationMapper;
import accenture.repositories.DeskRepository;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReservationService {

    private final DeskService deskService;
    private final ReservationMapper reservationMapper;
    private final DeskRepository deskRepository;

    public ReservationService(DeskService deskService, ReservationMapper reservationMapper, DeskRepository deskRepository) {
        this.deskService = deskService;
        this.reservationMapper = reservationMapper;
        this.deskRepository = deskRepository;
    }

    public List<ReservationDto> getAllReservationByOfficeAddress(String address) {
        return deskService.getAllDeskByOffice(address)
                .stream()
                .flatMap(desk -> desk.getReservations()
                        .stream()
                        .map(reservationMapper::map)
                ).collect(Collectors.toList());
    }

    public ReservationDto createNewReservation(ReservationDto reservationDto) {
        List<Reservation> reservations = deskRepository.findDeskByDeskNumberAndOffice_Address(reservationDto.getDeskNumber(), reservationDto.getOfficeAddress()).getReservations();

        //reservations.stream()
        //        .filter(r -> r.getReservationEndDateTime().isBefore(reservationDto.getReservationStartDateTime()))
        //        .filter(r -> r.getReservationStartDateTime().isAfter(reservationDto.getReservationEndDateTime()))
        //        .findFirst().
        return null;
    }
}
