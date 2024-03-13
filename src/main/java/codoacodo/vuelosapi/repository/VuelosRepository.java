package codoacodo.vuelosapi.repository;

import codoacodo.vuelosapi.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VuelosRepository extends JpaRepository<Flight, Long> {
    List<Flight> findByPrecioLessThanEqual(double precioMaximo);
}
