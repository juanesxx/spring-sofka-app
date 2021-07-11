package com.sofka.sofkaapp.service;

import java.util.List;

import com.sofka.sofkaapp.models.entity.Jugador;

public interface IJugadorService {

    public Jugador save(Jugador jugador);

    public List<Jugador> ObtenerJugadores();
}
