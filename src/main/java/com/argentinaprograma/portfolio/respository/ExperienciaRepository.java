
package com.argentinaprograma.portfolio.respository;

import com.argentinaprograma.portfolio.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository <Experiencia, Long> {
    
}
