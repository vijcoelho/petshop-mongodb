package br.com.petshop.teste.controlador;

import br.com.petshop.teste.entidade.Pet;
import br.com.petshop.teste.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/pet")
public class PetController {

    @Autowired
    private PetService petService;

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody Pet pet) {
        return petService.save(pet);
    }

    @GetMapping("/getNome")
    public ResponseEntity<Optional<Pet>> acharPeloNome(@RequestBody Map<String, String> request) {
        System.out.println(request);
        return petService.acharPeloNome(request);
    }
}
