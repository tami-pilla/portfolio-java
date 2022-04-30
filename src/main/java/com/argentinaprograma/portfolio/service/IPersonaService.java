
package com.argentinaprograma.portfolio.service;

import com.argentinaprograma.portfolio.model.Persona;
import java.util.List;


public interface IPersonaService {
    
     //Se van a declarar los metodos que luego se implementaran en PersonaService
    
    public List<Persona> verPersona(); 
    
    public void crearPersona(Persona per);
    
    public void borrarPersona(Long id);
    
    public Persona editarPersona(Persona per);
}
