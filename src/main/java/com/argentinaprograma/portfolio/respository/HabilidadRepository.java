
package com.argentinaprograma.portfolio.respository;

import com.argentinaprograma.portfolio.model.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadRepository extends JpaRepository <Habilidad, Long> {
    
}
