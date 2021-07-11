package com.sofka.sofkaapp.service;

import java.util.List;

import com.sofka.sofkaapp.models.dao.IResultadoDao;
import com.sofka.sofkaapp.models.entity.Resultado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultadoServiceImpl implements IResultadoService{

    @Autowired 
    private IResultadoDao resultadoDao;
    @Override
    public List<Resultado> obtenerResultados() {
        return (List<Resultado>) resultadoDao.findAll();
    }
    
}
