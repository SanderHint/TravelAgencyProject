package models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Tour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private City departureCity;

    @ManyToOne
    private City destinationCity;

    @ManyToOne
    private Hotel destinationHotel;

    @ManyToOne
    private Airport departureAirport;

    private LocalDate departureDate;
    private LocalDate returnDate;
    private int numberOfDays;
    private String type; // BB, HB, FB, AI
    private BigDecimal priceForAdult;
    private BigDecimal priceForChild;
    private boolean promoted;
    private int numberOfAdultSeats;
    private int numberOfChildSeats;

    // Constructors, getters, setters
}