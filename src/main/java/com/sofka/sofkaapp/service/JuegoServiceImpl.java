package com.sofka.sofkaapp.service;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.sofka.sofkaapp.models.dao.IJuegoDao;
import com.sofka.sofkaapp.models.entity.Juego;
import com.sofka.sofkaapp.models.entity.PrimariaLlave;
import com.sofka.sofkaapp.models.viewmodels.JuegoViewModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class JuegoServiceImpl implements IJuegoService{

    @Autowired
    private IJuegoDao iJuegoDao;

    @Transactional
    @Override
    public List<Juego> guardar(List<JuegoViewModel> juegos) {
        List<Juego> juegosInsertar = new ArrayList<>();
        UUID idJuego = UUID.randomUUID();

        for (JuegoViewModel juego : juegos) {
            Juego var = new Juego();
            PrimariaLlave primaria = new PrimariaLlave();

            primaria.setId_juego(idJuego);
            primaria.setId_vehiculo(juego.getId_vehiculo());
            
            var.setPrimariaLlave(primaria);
            var.setPuesto_ocupado(juego.getPuesto_ocupado());
            juegosInsertar.add(var);

        }
        for (Juego juego : juegosInsertar) {
            iJuegoDao.save(juego);            
        }
        return juegosInsertar;
    }

    @Override
    public int vecesGanadas(Long id, int puesto_ocupado) {
        return iJuegoDao.vecesGanadas(id, puesto_ocupado);
    }

    @Override
    public List<Juego> obtenerJuegos() {
        return (List<Juego>) iJuegoDao.findAll();
    }    
}
