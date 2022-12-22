package accenture.repositories;

import accenture.entity.Desk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeskRepository extends JpaRepository<Desk, Long> {

    Desk findDeskByDeskNumberAndOffice_Address(String deskNumber, String officeAddress);
}
