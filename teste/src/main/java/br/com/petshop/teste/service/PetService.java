package br.com.petshop.teste.service;

import br.com.petshop.teste.entidade.Pet;
import br.com.petshop.teste.repositorio.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@Service
public class PetService {

    @Autowired
    private PetRepository petRepository;

    public ResponseEntity<?> save(Pet pet) {
        if (pet == null) {
            return ResponseEntity.badRequest().body("Pet nao pode ser nulo!");
        }
        return ResponseEntity.ok("Pet salvo com sucesso! \n" + petRepository.save(pet).toString());
    }

    public ResponseEntity<Optional<Pet>> acharPeloNome(Map<String, String> request) {
        String nome = request.get("nome");
        if (nome == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(petRepository.findByNome(nome));
    }
}
