
package com.argentinaprograma.portfolio.controller;

import com.argentinaprograma.portfolio.model.Persona;
import com.argentinaprograma.portfolio.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/")
public class PersonaController {
    
    @Autowired
    private IPersonaService perServ;
    
    @GetMapping("/persona/ver")
    @ResponseBody
    public List<Persona> verPersona() {
      return perServ.verPersona();
    }
    
    @PostMapping("/persona/nueva")
    public void crearPersona (@RequestBody Persona per) {
        perServ.crearPersona(per);
    }
   
    
    @DeleteMapping("/persona/borrar/{id}")
    public void borrarPersona(@PathVariable Long id) {
        perServ.borrarPersona(id);
    }
    
     @PutMapping("/persona/editar/{id}")
     public void  editarPersona(@RequestBody Persona per){
       perServ.editarPersona(per);  
    }
}
