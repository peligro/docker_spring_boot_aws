package cl.tamila.docker.servicios;

import cl.tamila.docker.modelos.Contactos;
import cl.tamila.docker.repositorios.IContactosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactosService {
    @Autowired
    private IContactosRepository repositorio;

    public List<Contactos> listar()
    {
        return this.repositorio.findAll(Sort.by("id").descending());
    }
}
