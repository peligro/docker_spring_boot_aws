package cl.tamila.docker.controller;

import cl.tamila.docker.servicios.ContactosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/v1")
public class ContactosController {

    @Autowired
    private ContactosService contactosService;


    @GetMapping("/contactos")
    public ResponseEntity<?> metodo_get()
    {
        return ResponseEntity.status(HttpStatus.OK).body(this.contactosService.listar());
    }
}
