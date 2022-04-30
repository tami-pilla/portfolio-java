
package com.argentinaprograma.portfolio.controller;

import com.argentinaprograma.portfolio.model.Habilidad;
import com.argentinaprograma.portfolio.service.IHabilidadService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HabilidadController {
    
    @Autowired
    private IHabilidadService habServ;
    
    @GetMapping("/habilidades/ver")
    @ResponseBody 
    public List<Habilidad> verHabilidad() {
        return habServ.verHabilidad();
    }
    
    @PostMapping("/habilidades/nueva")
    public void agregarHabilidad(Habilidad hab) {
        habServ.agregarHabilidad(hab);
    }
    
    
    @DeleteMapping("/habilidades/borrar/{id}")
    public void borrarHabilidad(@PathVariable Long  id) {
        habServ.borrarHabilidad(id);
    }

}
