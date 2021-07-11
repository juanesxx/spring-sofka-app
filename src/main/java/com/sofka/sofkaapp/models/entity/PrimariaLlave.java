package com.sofka.sofkaapp.models.entity;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Embeddable;

@Embeddable
public class PrimariaLlave implements Serializable{
    
    
    private UUID id_juego;
    private int id_vehiculo;

    public UUID getId_juego() {
        return id_juego;
    }
    public void setId_juego(UUID id_juego) {
        this.id_juego = id_juego;
    }
    public int getId_vehiculo() {
        return id_vehiculo;
    }
    public void setId_vehiculo(int id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    
}
