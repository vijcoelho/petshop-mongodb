package br.com.petshop.teste.repositorio;

import br.com.petshop.teste.entidade.Pet;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.annotation.Collation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PetRepository extends MongoRepository<Pet, ObjectId> {
    Optional<Pet> findByNome(String nome);
}
