
package com.apivehiculos.apivehiculos.controller;

import com.apivehiculos.apivehiculos.model.Vehiculo;
import com.apivehiculos.apivehiculos.service.VehiculoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    
    @PostMapping("/registrar")
    public void registrar(@RequestBody Vehiculo vehiculo){
        vehiculoService.registrar(vehiculo);
    }
    
    @DeleteMapping("/eliminar")
    public void eliminar(@RequestBody Vehiculo vehiculo){
        vehiculoService.eliminar(vehiculo);
    }
    
    @GetMapping("/id/{id}")
    public Vehiculo buscarPorId(@PathVariable Long id){
        return vehiculoService.buscarPorId(id);
    }
    
    @PutMapping("/modificar")
    public void modificar(@RequestBody Vehiculo vehiculo){
        vehiculoService.modificar(vehiculo);
    }
    
}
