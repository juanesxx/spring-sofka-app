package com.sofka.sofkaapp.service;

import java.util.List;

import com.sofka.sofkaapp.models.dao.IVehiculoDao;
import com.sofka.sofkaapp.models.entity.Vehiculo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VehiculoServiceImpl implements IVehiculoService{


    @Autowired
    private IVehiculoDao vehiculoDao;
    
    @Override
    @Transactional(readOnly = true)
    public Vehiculo findById(Long id) {
        return vehiculoDao.findById(id).orElse(null);

    }

    @Transactional
    @Override
    public Vehiculo guardar(Vehiculo vehiculo) {
        return vehiculoDao.save(vehiculo);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Vehiculo> obtenerVehiculos() {
        return vehiculoDao.obtenerVehiculos();
    }

    @Override  
    public void reiniciar(){
        vehiculoDao.reiniciar();
    }

    
}
