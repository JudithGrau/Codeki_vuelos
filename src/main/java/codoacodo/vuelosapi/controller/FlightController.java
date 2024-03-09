package codoacodo.vuelosapi.controller;

import codoacodo.vuelosapi.model.Flight;
import codoacodo.vuelosapi.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/vuelos")
public class FlightController {
    @Autowired
    private FlightService flightService;

    @GetMapping("")
    public List<Flight> getAllFlights(){
        return flightService.traerTodosLosVuelos();
    }

    @PostMapping("/agregar")
    public void createFlight(@RequestBody Flight flight){
        flightService.crearVuelo(flight);
    }

    @GetMapping("/{id}")
    public Flight findFlightById(@PathVariable Long id){
        return flightService.buscarVueloPorId(id);
    }

    @DeleteMapping("/eliminar/{id}")
    public void deleteFlight(@PathVariable Long id){
        flightService.borrarVueloPorId(id);
    }
    @PutMapping("/actualizar")
    public Flight updateFlight(@RequestBody Flight flight){
        return flightService.actualizarVuelo(flight);
    }
}
