package com.sofka.sofkaapp.service;

import java.util.List;

import com.sofka.sofkaapp.models.dao.IJugadorDao;
import com.sofka.sofkaapp.models.entity.Jugador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class JugadorServiceImpl implements IJugadorService{

    @Autowired
    private IJugadorDao jugadorDao;

    @Transactional
    @Override
    public Jugador save(Jugador jugador) {
        return jugadorDao.save(jugador);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Jugador> ObtenerJugadores() {
        return (List<Jugador>) jugadorDao.findAll();
    }
    
}
