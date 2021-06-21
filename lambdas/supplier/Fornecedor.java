package lambdas.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Fornecedor {

    public static void main(String[] args) {
        Supplier<List<String>> umaLista =
                () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");

        Consumer<String> print = System.out::println;

        umaLista.get().forEach(print);
    }

}
