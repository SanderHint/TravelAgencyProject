package models;

import javax.persistence.*;

@Entity
public class Continent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "parent_continent_id") // Change this to the appropriate foreign key column name
    private Continent parentContinent;
}