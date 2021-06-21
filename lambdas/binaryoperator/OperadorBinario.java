package lambdas.binaryoperator;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

    public static void main(String[] args) {

        // tanto os parâmetros de entrada e o retorno são do mesmo tipo
        BinaryOperator<Double> media =
                (n1, n2) -> (n1 + n2) / 2;
        System.out.println(media.apply(9.8, 5.7));

        // receber duas notas e retornar o status, nao conseguimos fazer com a operacao binária
        // temos mais flexibilidade com o BiFunction pois definimos o tipo do primeiro e segundo parametro
        // e também do seu retorno
        BiFunction<Double, Double, String> resultado =
                (n1, n2) -> ((n1 + n2) / 2) >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado.apply(9.7, 5.1));

        Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(media.andThen(conceito).apply(9.7, 4.1));
    }

}
