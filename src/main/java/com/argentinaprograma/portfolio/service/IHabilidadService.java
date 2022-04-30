
package com.argentinaprograma.portfolio.service;


import com.argentinaprograma.portfolio.model.Habilidad;
import java.util.List;


public interface IHabilidadService {
    
    public List<Habilidad> verHabilidad(); 
    
    public void agregarHabilidad(Habilidad hab);
    
    public void borrarHabilidad(Long id);
    
}
