package models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "tour_id")
    private Tour tour;

    private int numAdults;
    private int numChildren;
    private double amount;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "booking_date")
    private Date bookingDate;

    public Booking() {
        this.bookingDate = new Date();
    }

    public Booking(Tour tour, int numAdults, int numChildren, double amount) {
        this.tour = tour;
        this.numAdults = numAdults;
        this.numChildren = numChildren;
        this.amount = amount;
        this.bookingDate = new Date();
    }

    // Getters and setters
    // ...

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public int getNumAdults() {
        return numAdults;
    }

    public void setNumAdults(int numAdults) {
        this.numAdults = numAdults;
    }

    public int getNumChildren() {
        return numChildren;
    }

    public void setNumChildren(int numChildren) {
        this.numChildren = numChildren;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }
}