package com.sofka.sofkaapp.contollers;

import java.util.List;

import com.sofka.sofkaapp.models.entity.Jugador;
import com.sofka.sofkaapp.service.IJugadorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class JugadorControlller {
    
    @Autowired
    private IJugadorService jugadorService;

    @GetMapping("resultados")
    public List<Jugador> obtenerJugadores(){
        return jugadorService.ObtenerJugadores();
    }

    @PostMapping("/")
    public Jugador save(@RequestBody Jugador jugador){
        return jugadorService.save(jugador);
    }
    
}
