package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import repository.*;


@Component
@Service
public class AdminService {
    private final ContinentRepository continentRepository;
    private final CountryRepository countryRepository;
    private final CityRepository cityRepository;
    private final AirportRepository airportRepository;
    private final HotelRepository hotelRepository;
    private final TourRepository tourRepository;


    @Autowired
    public AdminService(
            ContinentRepository ContinentRepository,
            CountryRepository countryRepository,
            CityRepository cityRepository,
            AirportRepository airportRepository,
            HotelRepository hotelRepository,
            TourRepository tourRepository) {

        this.continentRepository = ContinentRepository;
        this.countryRepository = countryRepository;
        this.cityRepository = cityRepository;
        this.airportRepository = airportRepository;
        this.hotelRepository = hotelRepository;
        this.tourRepository = tourRepository;

    }
}
    // Implement business logic for managing the tour offer, including adding/editing tours and configuring database entities
