package com.sofka.sofkaapp.contollers;

import java.util.List;

import com.sofka.sofkaapp.models.entity.Resultado;
import com.sofka.sofkaapp.service.IResultadoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ResultadoController {
    @Autowired
    private IResultadoService resultadoService;

    @GetMapping("/tabla")
    public List<Resultado> obtenerResultados(){
        return resultadoService.obtenerResultados();
    }

}
