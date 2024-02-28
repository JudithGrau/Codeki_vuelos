package codoacodo.vuelosapi.service;
import org.springframework.stereotype.Service;
import codoacodo.vuelosapi.model.Vuelo;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class VueloService {
    Vuelo vuelo1 = new Vuelo(1L,"EZE","LON", LocalDateTime.now(),LocalDateTime.now().plusHours(2),1500.50,"Diaria");
    //Vuelo vuelo2 = new Vuelo(1L,"EZE","LON", LocalDateTime.now(),LocalDateTime.now().plusHours(2),1500.50,"Diaria");
    Vuelo vuelo2 = new Vuelo(2L,"EZE","MAD",LocalDateTime.of(2024,2,26,11,0),LocalDateTime.of(2024,2,26,11,0).plusHours(2),1500.50,"Semanal");

    public List<Vuelo> listarVuelos() {
        return List.of(vuelo1, vuelo2);
    }
}
