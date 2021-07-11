package com.sofka.sofkaapp.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "tbl_resultados")
@Table(name = "tbl_resultados")
public class Resultado implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_resultado;

    private int id_vehiculo;
    private int puesto_ocupado;
    private int contador_puesto_ocupado;

    public Long getId_resultado() {
        return id_resultado;
    }
    public void setId_resultado(Long id_resultado) {
        this.id_resultado = id_resultado;
    }
    public int getId_vehiculo() {
        return id_vehiculo;
    }
    public void setId_vehiculo(int id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }
    public int getPuesto_ocupado() {
        return puesto_ocupado;
    }
    public void setPuesto_ocupado(int puesto_ocupado) {
        this.puesto_ocupado = puesto_ocupado;
    }
    public int getContador_puesto_ocupado() {
        return contador_puesto_ocupado;
    }
    public void setContador_puesto_ocupado(int contador_puesto_ocupado) {
        this.contador_puesto_ocupado = contador_puesto_ocupado;
    }
    
    
}
