package accenture.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "Office")
@Getter
@Setter
public class Office {

    @Id
    private Long id;
    private String address;
    private String city;
    private String country;
    private LocalTime closingTime;

    @OneToMany(mappedBy = "office")
    private List<Desk> desks;

}
