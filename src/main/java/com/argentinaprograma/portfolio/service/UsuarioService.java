
package com.argentinaprograma.portfolio.service;

import com.argentinaprograma.portfolio.model.Usuario;
import com.argentinaprograma.portfolio.respository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService {
   
    @Autowired
    public UsuarioRepository usuRepo;

    @Override
    public void loginUsuario(Usuario usu) {
       usuRepo.save(usu);
    }
}
