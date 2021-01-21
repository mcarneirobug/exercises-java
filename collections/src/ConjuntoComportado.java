import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args) {

        /**
         * Set não respeita ordenação
         */

        Set<String> lista = new HashSet<>();
        lista.add("Raíssa");
        lista.add("Anna");
        lista.add("Matheus");
        lista.add("Vitor");
        lista.add("Eduardo");

        for (String candidato : lista) {
            System.out.println(candidato);
        }
        System.out.println("\n");

        /**
         * Para utilizarmos conjuntos ordenados
         * utilizaremos o TreeSet que faz parte
         * do SortedSet
         *
         * O TreeSet aceita ordenação baseado na
         * ordem alfabética ou se for números ordem crescente.
         */

        SortedSet<String> listaAprovados = new TreeSet<>();
        listaAprovados.add("Matheus");
        listaAprovados.add("Anna");
        listaAprovados.add("Raíssa");
        listaAprovados.add("Eduardo");
        listaAprovados.add("Israel");

        for (String candidate : listaAprovados) {
            System.out.println(candidate);
        }
        System.out.println("\n");

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        for (int n : nums) {
            System.out.println(n);
        }

    }
}
