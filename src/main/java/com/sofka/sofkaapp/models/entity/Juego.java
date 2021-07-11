package com.sofka.sofkaapp.models.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "tbl_juegos")
@Table(name = "tbl_juegos")
public class Juego implements Serializable{
    
    @EmbeddedId
    private PrimariaLlave primariaLlave;

    private int puesto_ocupado;

    
    public PrimariaLlave getPrimariaLlave() {
        return primariaLlave;
    }
    public void setPrimariaLlave(PrimariaLlave primariaLlave) {
        this.primariaLlave = primariaLlave;
    }
    public int getPuesto_ocupado() {
        return puesto_ocupado;
    }
    public void setPuesto_ocupado(int puesto_ocupado) {
        this.puesto_ocupado = puesto_ocupado;
    }   

}


