package com.sofka.sofkaapp.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "tbl_jugadores")
@Table (name = "tbl_jugadores")
public class Jugador implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jugador_id;

    private String nombre;
    private int vehiculo;
    
    public Long getId() {
        return jugador_id;
    }
    public void setId(Long id) {
        this.jugador_id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(int vehiculo) {
        this.vehiculo = vehiculo;
    }

    


}
