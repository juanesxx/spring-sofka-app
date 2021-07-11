package com.sofka.sofkaapp.service;

import java.util.List;

import com.sofka.sofkaapp.models.entity.Vehiculo;

public interface IVehiculoService {
    public Vehiculo findById(Long id);

    public Vehiculo guardar(Vehiculo vehiculo);

    public List<Vehiculo> obtenerVehiculos();

    public void reiniciar();
    
}
