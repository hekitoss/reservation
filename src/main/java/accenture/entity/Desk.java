package accenture.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Desk")
@Getter
@Setter
public class Desk {

    @Id
    private Long id;
    private String deskNumber;

    @OneToMany(mappedBy = "desk")
    private List<Reservation> reservations;

    @ManyToOne
    @JoinColumn(name = "office_id")
    private Office office;

}
