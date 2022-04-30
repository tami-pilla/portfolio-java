
package com.argentinaprograma.portfolio.service;

import com.argentinaprograma.portfolio.model.Experiencia;
import com.argentinaprograma.portfolio.respository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {

    @Autowired
    public ExperienciaRepository expRepo;
    
    @Override
    public List<Experiencia> verExperiencia() {
         return expRepo.findAll();
    }

    @Override
    public void agregarExperiencia(Experiencia exp) {
        expRepo.save(exp);
    }

    @Override
    public void borrarExperiencia(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public Experiencia editarExperiencia(Experiencia exp) {
         return expRepo.save(exp);
    }
    
}
