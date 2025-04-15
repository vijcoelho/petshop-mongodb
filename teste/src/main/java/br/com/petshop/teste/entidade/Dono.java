package br.com.petshop.teste.entidade;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "dono")
public class Dono {
    @Id
    private ObjectId idDono;
    private String nome;

    public Dono() {
    }

    public Dono(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Dono{" +
                "idDono=" + idDono +
                ", nome='" + nome + '\'' +
                '}';
    }
}
