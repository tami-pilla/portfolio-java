
package com.argentinaprograma.portfolio.controller;

import com.argentinaprograma.portfolio.model.Usuario;
import com.argentinaprograma.portfolio.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/")
public class UsuarioController {
    
    @Autowired
    public IUsuarioService usuServ;
   
}
