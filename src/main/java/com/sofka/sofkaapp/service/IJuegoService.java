package com.sofka.sofkaapp.service;

import com.sofka.sofkaapp.models.entity.Juego;
import com.sofka.sofkaapp.models.viewmodels.JuegoViewModel;
import java.util.List;

public interface IJuegoService {

    public List<Juego> obtenerJuegos();

    public List<Juego> guardar(List<JuegoViewModel> juegos);

    public int vecesGanadas(Long id, int puesto_ocupado);

}
