
package com.apivehiculos.apivehiculos.controller;

import com.apivehiculos.apivehiculos.model.Vehiculo;
import com.apivehiculos.apivehiculos.service.VehiculoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vehiculo")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class VehiculoController {
    
    @Autowired
    VehiculoService vehiculoService;
    
    @GetMapping("/listar")
    public List<Vehiculo> listar(){
        return vehiculoService.listar();
    }
    
}
