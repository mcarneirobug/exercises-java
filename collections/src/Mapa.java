import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();

        /*
         * Adiciona senão existir, porém se já existir
         * vai ser substituído - put()
         * Basta colocar a chave que é única e o que irá
         * mudar é o seu valor
         */

        usuarios.put(1, "Matheus");
        usuarios.put(1, "Anna");

        usuarios.put(2, "Raíssa");
        usuarios.put(3, "Eduardo");

        System.out.println("Obter o tamanho: " + usuarios.size());
        System.out.println("Verifica se é vazio: " + usuarios.isEmpty());

        System.out.println("Obter as chaves: " + usuarios.keySet()); // a coluna das chaves é um conjunto

        System.out.println("Obter apenas os valores: " + usuarios.values()); // apenas os valores

        System.out.println("Obter a chave e o valor: " + usuarios.entrySet()); // pegar chave e valor

        System.out.println("Verifica se contém a chave: " + usuarios.containsKey(2));
        System.out.println("Verifica se contém o valor: " + usuarios.containsValue("Raíssa"));

        System.out.println("Obter o valor a partir da chave: " + usuarios.get(2)); // a partir da key, pega o valor

        /*
         * Pecorre apenas nas chaves
         */

        System.out.println("\nPecorre apenas nas chaves: ");
        for (int chave: usuarios.keySet()) {
            System.out.println(chave);
        }

        /*
         * Pecorre apenas os valores
         */
        System.out.println("\nPecorre apenas nos valores: ");
        for (String valor : usuarios.values()) {
            System.out.println(valor);
        }

        /*
         * Para pecorrer tanto na chave e no valor
         * utilizaremos o Entry
         */
        System.out.println("\nPecorre nas chaves e nos valores: ");
        for (Map.Entry<Integer, String> registro : usuarios.entrySet()) {
            System.out.println("(" + registro.getKey() + ") " + registro.getValue());
        }

    }

}
