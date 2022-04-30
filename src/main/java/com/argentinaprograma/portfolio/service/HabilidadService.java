
package com.argentinaprograma.portfolio.service;

import com.argentinaprograma.portfolio.model.Habilidad;
import com.argentinaprograma.portfolio.respository.HabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadService implements IHabilidadService {

    @Autowired
    public HabilidadRepository habRepo;
    
    @Override
    public List<Habilidad> verHabilidad() {
         return habRepo.findAll();
    }

    @Override
    public void agregarHabilidad(Habilidad hab) {
        habRepo.save(hab);
    }

    @Override
    public void borrarHabilidad(Long id) {
         habRepo.deleteById(id);
    }
    
}
