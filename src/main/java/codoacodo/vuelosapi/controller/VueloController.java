package codoacodo.vuelosapi.controller;

import codoacodo.vuelosapi.model.Vuelo;
import codoacodo.vuelosapi.service.VueloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vuelos")
public class VueloController {
    @Autowired
    private VueloService vueloService;

    @GetMapping()
    public List<Vuelo> vuelos(){
        return vueloService.listarVuelos();
    }
}
