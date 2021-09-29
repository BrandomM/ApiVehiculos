
package com.apivehiculos.apivehiculos.service;

import com.apivehiculos.apivehiculos.model.Vehiculo;
import java.util.List;


public interface VehiculoService {
    public List<Vehiculo> listar();
    public void registrar(Vehiculo vehiculo);
    public void eliminar(Vehiculo vehiculo);
    public Vehiculo buscarPorId(Long id);
    public void modificar(Vehiculo vehiculo);
}
