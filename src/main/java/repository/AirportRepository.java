package repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AirportRepository<Airport>  extends JpaRepository<Airport, Long> {
}













