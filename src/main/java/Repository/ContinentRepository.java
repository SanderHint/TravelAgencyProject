package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContinentRepository<Continent> extends JpaRepository <Continent, Long> {

}
