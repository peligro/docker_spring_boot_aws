package cl.tamila.docker.repositorios;

import cl.tamila.docker.modelos.Contactos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IContactosRepository extends JpaRepository<Contactos, Long> {


}
