package codoacodo.vuelosapi.repository;

import codoacodo.vuelosapi.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findByOrigin(String origin);
    List<Flight> findByOriginAndDestiny(String origin, String destiny);
}
