package br.com.benezinho.model;

public class Categoria {

    private String nome;


   //na prova ele vai pedir para colocar os dois construotores
    public Categoria() {
    }

    public Categoria(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //vai pedir o to string tambem
    @Override
    public String toString() {
        return "Categoria{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
