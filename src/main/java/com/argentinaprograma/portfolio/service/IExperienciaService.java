
package com.argentinaprograma.portfolio.service;


import com.argentinaprograma.portfolio.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    
    public List<Experiencia> verExperiencia(); 
    
    public void agregarExperiencia(Experiencia exp);
    
    public void borrarExperiencia(Long id);
    
    public Experiencia editarExperiencia(Experiencia exp);
}
