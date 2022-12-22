package accenture.mapper;

import accenture.dto.ReservationDto;
import accenture.entity.Reservation;
import org.springframework.stereotype.Component;

@Component
public class ReservationMapper {

    public ReservationDto map(Reservation reservation) {
        return new ReservationDto()
                .setReservationStartDateTime(reservation.getReservationStartDateTime())
                .setReservationEndDateTime(reservation.getReservationEndDateTime())
                .setDeskNumber(reservation.getDesk().getDeskNumber())
                .setOfficeAddress(reservation.getDesk().getOffice().getAddress());
    }
}
