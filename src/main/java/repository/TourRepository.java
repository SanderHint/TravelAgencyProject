package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TourRepository<Tour> extends JpaRepository<Tour, Long> {
    List<Tour> findUpcomingToursGlobally();

    <Tour> List<Tour> findPromotedTrips();
}
