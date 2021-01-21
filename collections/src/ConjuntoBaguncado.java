import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

    public static void main(String [] args) {

        HashSet conjunto = new HashSet();

        /**
         * Irá fazer a conversão do tipo primitivo para classe
         * e.g: double -> Double
         */
        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho é " + conjunto.size());

        /**
         * Não será adicionado, pois se trata de um conjunto
         * sem valores repetidos
         */

        conjunto.add("Teste");
        conjunto.add('x');

        System.out.println("Tamanho é " + conjunto.size());

        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove('x'));

        System.out.println("Tamanho é " + conjunto.size());

        /**
         * contains() - é utilizado para saber se o elemento está
         * ou não contido dentro do conjunto
         */
        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains(1));

        Set numbs = new HashSet();
        numbs.add(1);
        numbs.add(2);
        numbs.add(3);

        System.out.println(numbs);
        System.out.println(conjunto);

        /**
         * Para fazermos à união entre dois conjuntos
         * utilizaremos o addAll()
         */
        conjunto.addAll(numbs);

        System.out.println("União entre dois conjuntos: " + conjunto);

        /**
         * Para fazermos à interseção entre dois conjuntos
         * utilizaremos o retainAll()
         */
        conjunto.retainAll(numbs);

        System.out.println("Interseção entre dois conjuntos: " + conjunto);

        conjunto.clear();

        System.out.println("Conjunto vazio: " + conjunto);
    }

}
