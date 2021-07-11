package com.sofka.sofkaapp.models.dao;

import com.sofka.sofkaapp.models.entity.Juego;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface IJuegoDao extends CrudRepository<Juego, Long>{


    @Query(value = "select count(id_vehiculo) from tbl_juegos where id_vehiculo=  :id and puesto_ocupado= :puesto_ocupado group by id_vehiculo, puesto_ocupado", nativeQuery = true)
    public int vecesGanadas(@Param("id") Long id, @Param("puesto_ocupado") int puesto_ocupado);

}
