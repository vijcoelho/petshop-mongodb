package br.com.petshop.teste.entidade;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "pet")
public class Pet {
    @Id
    private ObjectId idPet;
    private String nome;
    private String nomeDono;
    private String raca;
    private List<String> vacinas;

    public Pet() {
    }

    public Pet(String nome, String nomeDono, String raca, List<String> vacinas) {
        this.nome = nome;
        this.nomeDono = nomeDono;
        this.raca = raca;
        this.vacinas = vacinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public List<String> getVacinas() {
        return vacinas;
    }

    public void setVacinas(List<String> vacinas) {
        this.vacinas = vacinas;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "idPet=" + idPet +
                ", nome='" + nome + '\'' +
                ", nome Dono=" + nomeDono +
                ", raca='" + raca + '\'' +
                ", vacinas=" + vacinas +
                '}';
    }
}
