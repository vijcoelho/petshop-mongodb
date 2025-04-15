package br.com.petshop.teste.service;

import br.com.petshop.teste.entidade.Dono;
import br.com.petshop.teste.repositorio.DonoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DonoService {

    @Autowired
    private DonoRepository donoRepository;

    public ResponseEntity<?> save(Dono dono) {
        if (dono == null) {
            return ResponseEntity.badRequest().body("Dono nao pode ser nulo!");
        }
        return ResponseEntity.ok("Dono salvo com sucesso! \n" + donoRepository.save(dono).toString());
    }
}
