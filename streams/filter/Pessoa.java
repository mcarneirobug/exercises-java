package streams.filter;

public class Pessoa {

    private final String nome;
    private final int idade;
    private final char genero;

    public Pessoa(String nome, int idade, char genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public char getGenero() {
        return genero;
    }
}
