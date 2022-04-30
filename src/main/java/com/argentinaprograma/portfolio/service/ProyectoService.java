package com.argentinaprograma.portfolio.service;

import com.argentinaprograma.portfolio.model.Proyecto;
import com.argentinaprograma.portfolio.respository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService {

    @Autowired
    public ProyectoRepository proRepo;

    @Override
    public List<Proyecto> verProyecto() {
        return proRepo.findAll();
    }

    @Override
    public void agregarProyecto(Proyecto pro) {
        proRepo.save(pro);
    }

    @Override
    public void borrarProyecto(Long id) {
        proRepo.deleteById(id);
    }

    @Override
    public Proyecto editarProyecto(Proyecto pro) {
        return proRepo.save(pro);
    }

}
