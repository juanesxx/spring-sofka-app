package com.sofka.sofkaapp.contollers;

import java.util.List;

import com.sofka.sofkaapp.models.entity.Juego;
import com.sofka.sofkaapp.models.viewmodels.JuegoViewModel;
import com.sofka.sofkaapp.service.IJuegoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class JuegoController {
    
    @Autowired
    private IJuegoService juegoService;
    
    @GetMapping("resultados/{id}/{puesto_ocupado}")
    public int vecesGanadas(@PathVariable Long id, @PathVariable int puesto_ocupado){
        return juegoService.vecesGanadas(id, puesto_ocupado);
    }
 
    @PostMapping("/juego")
    public List<Juego> guardar(@RequestBody List<JuegoViewModel> juegos){
        return juegoService.guardar(juegos);
    }

    @GetMapping("/juegos")
    public List<Juego> obtenerJuegos(){
        return juegoService.obtenerJuegos();
    }
}
