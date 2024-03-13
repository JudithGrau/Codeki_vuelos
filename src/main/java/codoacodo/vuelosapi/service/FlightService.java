package codoacodo.vuelosapi.service;

import codoacodo.vuelosapi.model.Flight;
import codoacodo.vuelosapi.repository.VuelosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FlightService {

    @Autowired
    VuelosRepository vuelosRepository;

    public List<Flight> traerTodosLosVuelos(){
        return vuelosRepository.findAll();
    }

    public void crearVuelo(Flight flight){
        vuelosRepository.save(flight);
    }
    public Flight buscarVueloPorId(Long id) {
        return vuelosRepository.findById(id).orElse(null);
    }

    public void borrarVueloPorId(Long id) {
        vuelosRepository.deleteById(id);
    }

    public Flight actualizarVuelo(Flight flight){
        vuelosRepository.save(flight);
        return vuelosRepository.findById(flight.getId()).orElse(null);
    }

//    public List<Flight> getOffers(Integer offerPrice){
//
//        List<Flight> flights = vuelosRepository.findAll();
//        List<Flight> offerFlights = new ArrayList<>();
//
//        for(Flight flight : flights){
//            if(flight.getPrecio() < offerPrice) {
//                offerFlights.add(flight);
//            }
//        }
//        return offerFlights;
//    }
public List<Flight> getOffers(int offerPrice) {
    return vuelosRepository.findAll().stream()
            .filter(flight -> flight.getPrecio() < offerPrice)
            .collect(Collectors.toList());
}

}
