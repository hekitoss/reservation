package accenture.repositories;

import accenture.entity.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OfficeRepository extends JpaRepository<Office, Long> {

    List<Office> findAllByCountry(String country);

    Office findOfficeByAddress(String address);
}
