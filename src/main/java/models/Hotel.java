package models;

import javax.persistence.*;

@Entity
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int stars;
    private String description;

    @ManyToOne
    private City city;

    // Constructors, getters, setters
}
