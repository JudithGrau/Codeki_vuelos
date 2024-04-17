package codoacodo.vuelosapi.controller;

import codoacodo.vuelosapi.model.Dolar;
import codoacodo.vuelosapi.model.Flight;
import codoacodo.vuelosapi.model.FlightDto;
import codoacodo.vuelosapi.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/flights")
public class FlightController {
    @Autowired
    FlightService flightService;

    @GetMapping("")
    public List<FlightDto> getAllFlights(){
        return flightService.findAll();
    }

    @PostMapping("/add")
    public void createFlight(@RequestBody Flight flight){
        flightService.createFlight(flight);
    }

    @GetMapping("/{id}")
    public Optional<Flight> findFlightById(@PathVariable Long id){
        return flightService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFlight(@PathVariable Long id){
        flightService.delete(id);
    }
    @PutMapping("/update")
    public Optional<Flight> updateFlight(@RequestBody Flight flight){
        return flightService.update(flight);
    }
    @GetMapping("/origin")
    public List<Flight> getFlightsByLocations(@RequestParam String origin) {
        return flightService.getByOrigin(origin);
    }
    @GetMapping("/offers")
    public List<Flight> getOffers(){
        Integer offerPrice = 24000;
        return flightService.getOffers(offerPrice);
    }
    @GetMapping("/locations")
    public List<Flight> getFlightsByLocations(@RequestParam String origin, @RequestParam String destiny) {
        return flightService.getByOriginAndDestiny(origin, destiny);
    }
    @GetMapping("/allDolars")
    public List<Dolar> getAllDolars(){
        return flightService.getAllDolars();
    }
}
