package com.example.FipeApi.controller;

import  org.springframework.web.bind.annotation.RestController;

import com.example.FipeApi.service.Service;

import  org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController 
public class Controller {
    
    Service service = new Service();
    
    @GetMapping("/fipe")
    public String consultarMarcas(){
        return  service.consultarMarcas();
        
    }

    @GetMapping("/fipe/{n}")
    public String consultarModelos(@PathVariable("n") String n){
        return service.consultarModelos(n);
    }

    @GetMapping("/fipe/{idMarca}/{idModelo}")
    public String consultarAnos(@PathVariable("idMarca")String idMarca ,@PathVariable("idModelo")String idModelo) {
        return service.consultarAnos(idMarca,idModelo);
    }

    @GetMapping("/fipe/{idMarca}/{idModelo}/{idAno}")
    public String consultarModeloValor(@PathVariable("idMarca")String idMarca ,@PathVariable("idModelo")String idModelo,@PathVariable("idAno")String idAno){
        return service.consultarModeloValor(idMarca, idModelo,idAno);
    }
    
        
    
    
}
