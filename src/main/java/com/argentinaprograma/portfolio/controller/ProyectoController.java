
package com.argentinaprograma.portfolio.controller;

import com.argentinaprograma.portfolio.model.Habilidad;
import com.argentinaprograma.portfolio.model.Proyecto;
import com.argentinaprograma.portfolio.service.IHabilidadService;
import com.argentinaprograma.portfolio.service.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/")
public class ProyectoController {
    
    @Autowired
    private IProyectoService proyServ;
    
    @GetMapping("/proyecto/ver")
    @ResponseBody 
    public List<Proyecto> verProyecto() {
        return proyServ.verProyecto();
    }
    
    @PostMapping("/proyecto/nueva")
    public void agregarProyecto(Proyecto proj) {
        proyServ.agregarProyecto(proj);
    }
    
    
    @DeleteMapping("/proyecto/borrar/{id}")
    public void borrarProyecto(@PathVariable Long  id) {
        proyServ.borrarProyecto(id);
    }
}
