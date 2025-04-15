package br.com.petshop.teste.controlador;

import br.com.petshop.teste.entidade.Dono;
import br.com.petshop.teste.service.DonoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dono")
public class DonoController {

    @Autowired
    private DonoService donoService;

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody Dono dono) {
        return donoService.save(dono);
    }
}
