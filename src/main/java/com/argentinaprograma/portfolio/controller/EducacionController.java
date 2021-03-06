
package com.argentinaprograma.portfolio.controller;

import com.argentinaprograma.portfolio.model.Educacion;
import com.argentinaprograma.portfolio.service.IEducacionService;
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
public class EducacionController {
 
    @Autowired
    private IEducacionService eduServ;
    
    @GetMapping("/educacion/ver")
    @ResponseBody
    public List<Educacion> verEducacion(){
        return eduServ.verEducacion();
    } 
    
    @PostMapping("/educacion/nueva")
    public void agregarEducacion(@RequestBody Educacion edu){
        eduServ.agregarEducacion(edu);
    }
    
    @DeleteMapping("/educacion/borrar/{id}")
    public void borrarEducacion(@PathVariable Long id){
        eduServ.borrarEducacion(id);
    }
    
    @PutMapping("/educacion/editar/{id}")
    public Educacion editarEducacion(@RequestBody Educacion edu){
        return eduServ.editarEducacion(edu);
    }

       
}
