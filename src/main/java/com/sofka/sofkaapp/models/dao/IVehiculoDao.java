package com.sofka.sofkaapp.models.dao;

import java.util.List;

import com.sofka.sofkaapp.models.entity.Vehiculo;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface IVehiculoDao extends CrudRepository<Vehiculo, Long>{
    
    @Transactional
    @Modifying
    @Query("update tbl_vehiculos tv set tv.metros_avanzados=0 where tv.metros_avanzados>0")
    public void reiniciar();

    @Transactional(readOnly = true)
    @Query(value = "select tv.vehiculo_id, tv.tipo_vehiculo, tv.carril, tv.metros_avanzados from tbl_vehiculos tv inner join tbl_jugadores tj on tv.vehiculo_id = tj.vehiculo", nativeQuery = true)
    public List<Vehiculo> obtenerVehiculos();
}
