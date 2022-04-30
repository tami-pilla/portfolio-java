
package com.argentinaprograma.portfolio.service;

import com.argentinaprograma.portfolio.model.Educacion;
import com.argentinaprograma.portfolio.respository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {

    @Autowired
    public EducacionRepository eduRepo;
    
    @Override
    public List<Educacion> verEducacion() {
        return eduRepo.findAll();
    }

    @Override
    public void agregarEducacion(Educacion edu) {
       eduRepo.save(edu);
    }

    @Override
    public void borrarEducacion(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public Educacion editarEducacion(Educacion edu) {
        return eduRepo.save(edu);
    }
    
}
