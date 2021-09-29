
package com.apivehiculos.apivehiculos.dao;

import com.apivehiculos.apivehiculos.model.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculoDao extends JpaRepository<Vehiculo, Long>{
    
}
