
package com.argentinaprograma.portfolio.service;

import com.argentinaprograma.portfolio.model.Persona;
import com.argentinaprograma.portfolio.respository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    public PersonaRepository perRepo;
    
    public List<Persona> verPersona() {
        return perRepo.findAll();
    }

    @Override
    public void borrarPersona(Long id) {
        perRepo.deleteById(id);
    }

    @Override
    public Persona editarPersona(Persona per) {
        return perRepo.save(per);
    }

    @Override
    public void crearPersona(Persona per) {
       perRepo.save(per);
    }

    

 
    
}
