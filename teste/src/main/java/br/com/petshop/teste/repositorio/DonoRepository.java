package br.com.petshop.teste.repositorio;

import br.com.petshop.teste.entidade.Dono;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonoRepository extends MongoRepository<Dono, ObjectId> {

}
