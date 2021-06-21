package streams.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

    public static void main(String[] args) {
        List<Pessoa> pessoas = criarPessoas();

        Consumer<String> println = System.out::println;

        Predicate<Pessoa> maiorDeIdade = p -> p.getIdade() >= 18;
        Predicate<Pessoa> nomeIniciadoPorM = p -> p.getNome().startsWith("M");
        Predicate<Pessoa> generoMasculino = p -> p.getGenero() == 'M';
        Function<Pessoa, String> jaPodeDirigir =
                p -> "Parabéns " + p.getNome() + "! Você já pode dirigir!";

        pessoas.stream()
                .filter(maiorDeIdade)
                .filter(nomeIniciadoPorM)
                .filter(generoMasculino)
                .map(jaPodeDirigir)
                .forEach(println);
    }

    public static List<Pessoa> criarPessoas() {
        List<Pessoa> pessoas = new ArrayList<>();

        Pessoa p1 = new Pessoa("Matheus", 21, 'M');
        Pessoa p2 = new Pessoa("Anna", 21, 'F');
        Pessoa p3 = new Pessoa("Bernardo", 22, 'M');
        Pessoa p4 = new Pessoa("Mateo", 18, 'M');

        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);

        return pessoas;
    }

}
