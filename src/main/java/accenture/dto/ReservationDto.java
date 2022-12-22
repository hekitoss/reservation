package accenture.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@Accessors(chain = true)
public class ReservationDto {

    private LocalDateTime reservationStartDateTime;
    private LocalDateTime reservationEndDateTime;
    private String deskNumber;
    private String officeAddress;
}
