
package com.argentinaprograma.portfolio.service;


import com.argentinaprograma.portfolio.model.Proyecto;
import java.util.List;


public interface IProyectoService {
    
    public List<Proyecto> verProyecto(); 
    
    public void agregarProyecto(Proyecto pro);
    
    public void borrarProyecto(Long id);
    
    public Proyecto editarProyecto(Proyecto pro);
}
