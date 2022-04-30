
package com.argentinaprograma.portfolio.service;

import com.argentinaprograma.portfolio.model.Educacion;
import java.util.List;

public interface IEducacionService {
    
    public List<Educacion> verEducacion(); 
    
    public void agregarEducacion(Educacion edu);
    
    public void borrarEducacion(Long id);
    
    public Educacion editarEducacion(Educacion edu);
}
