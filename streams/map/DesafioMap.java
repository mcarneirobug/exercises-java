package streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

    /*
     *  1. Número para string binária... 6 => "110"
     *  2. Inverter a string... "110" => "011"
     *  3. Converter de volta para inteiro => "011" => 3
     */

    public static void main(String[] args) {

        Consumer<Integer> print = System.out::println;
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        /*
         * Como estou convertendo de String para String podemos utilizar a função unária
         */
        UnaryOperator<String> reverterString = n -> new StringBuilder(n).reverse().toString();

        /*
         * Quando queremos converter de um tipo para outro utilizamos a Function
         */
        Function<String, Integer> binarioParaInt =
                s -> Integer.parseInt(s, 2);

        nums.stream()
                .map(Integer::toBinaryString)
                .map(reverterString)
                .map(binarioParaInt)
                .forEach(print);
    }

}
