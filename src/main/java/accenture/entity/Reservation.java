package accenture.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Reservation {
    @Id
    private Long id;
    private LocalDateTime reservationStartDateTime;
    private LocalDateTime reservationEndDateTime;
    @ManyToOne
    @JoinColumn(name = "desk_id")
    private Desk desk;
}
