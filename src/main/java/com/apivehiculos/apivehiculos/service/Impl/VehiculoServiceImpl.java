
package com.apivehiculos.apivehiculos.service.Impl;

import com.apivehiculos.apivehiculos.dao.VehiculoDao;
import com.apivehiculos.apivehiculos.model.Vehiculo;
import com.apivehiculos.apivehiculos.service.VehiculoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehiculoServiceImpl implements VehiculoService {

    @Autowired
    VehiculoDao vehiculoDao;
    
    @Override
    public List<Vehiculo> listar() {
        return vehiculoDao.findAll();
    }
    
}
