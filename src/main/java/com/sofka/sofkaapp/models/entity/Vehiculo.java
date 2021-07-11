package com.sofka.sofkaapp.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "tbl_vehiculos")
@Table (name = "tbl_vehiculos")
public class Vehiculo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehiculo_id;

    private String tipo_vehiculo;
    private int carril;
    private int metros_avanzados;

    public Long getId() {
        return vehiculo_id;
    }
    public void setId(Long id) {
        this.vehiculo_id = id;
    }
    public String getTipo_vehiculo() {
        return tipo_vehiculo;
    }
    public void setTipo_vehiculo(String tipo_vehiculo) {
        this.tipo_vehiculo = tipo_vehiculo;
    }
    public int getCarril() {
        return carril;
    }
    public void setCarril(int carril) {
        this.carril = carril;
    }
    public int getMetros_avanzados() {
        return metros_avanzados;
    }
    public void setMetros_avanzados(int metros_avanzados) {
        this.metros_avanzados = metros_avanzados;
    }

    
}
