package models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Tour tour;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Participant> participants;

    private BigDecimal amount;

    // Constructors, getters, setters
}