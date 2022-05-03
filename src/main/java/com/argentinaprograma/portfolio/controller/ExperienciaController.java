
package com.argentinaprograma.portfolio.controller;

import com.argentinaprograma.portfolio.model.Educacion;
import com.argentinaprograma.portfolio.model.Experiencia;
import com.argentinaprograma.portfolio.service.IExperienciaService;
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
public class ExperienciaController {
    
    @Autowired
    private IExperienciaService expServ;
    
    
    @GetMapping("/experiencia/ver")
    @ResponseBody
    public List<Experiencia> verExperiencia(){
        return expServ.verExperiencia();
    } 
    
    @PostMapping("/experiencia/nueva")
    public void agregarEducacion(@RequestBody Experiencia exp){
        expServ.agregarExperiencia(exp);
    }
    
    @DeleteMapping("/experiencia/borrar/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        expServ.borrarExperiencia(id);
    }
    
    @PutMapping("/experiencia/editar/{id}")
    public Experiencia editarExperiencia(@RequestBody Experiencia exp){
        return expServ.editarExperiencia(exp);
    }
    
    
}
