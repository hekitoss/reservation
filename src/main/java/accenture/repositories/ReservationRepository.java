package accenture.repositories;

import accenture.entity.Desk;
import accenture.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    List<Reservation> findAllByDesk(Desk desk);
}
