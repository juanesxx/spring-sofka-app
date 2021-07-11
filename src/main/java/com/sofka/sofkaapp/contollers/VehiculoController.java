package com.sofka.sofkaapp.contollers;

import java.util.List;

import com.sofka.sofkaapp.models.entity.Vehiculo;
import com.sofka.sofkaapp.service.IVehiculoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class VehiculoController {
   
    @Autowired
    private IVehiculoService vehiculoService;

    @GetMapping("/")
    public List<Vehiculo> obtenerVehiculos(){
        return vehiculoService.obtenerVehiculos();
    }


    @GetMapping("/{id}")
    public Vehiculo incio(@PathVariable Long id){
        return vehiculoService.findById(id);
    }
    
    @PutMapping("/{id}")
    public Vehiculo actualizar(@RequestBody Vehiculo vehiculo, @PathVariable Long id){
        Vehiculo vehiculoActual = vehiculoService.findById(id);
        if(vehiculo.getMetros_avanzados() >= 5000){
            vehiculoActual.setMetros_avanzados(0);
        } else {
            vehiculoActual.setMetros_avanzados(vehiculo.getMetros_avanzados());
        }
        return vehiculoService.guardar(vehiculoActual);
    }

    @PutMapping("/")
    public void reiniciar(){
        vehiculoService.reiniciar();
    }
}
