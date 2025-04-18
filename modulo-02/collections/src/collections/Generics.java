package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List <String> prateleira = new ArrayList();
        prateleira.add("Ferrari");
        prateleira.add("Camaro");
        prateleira.add("Fusca");

        // ordena
        Collections.sort(prateleira);

        // inverte
        Collections.reverse(prateleira);

        // embaralha
        Collections.shuffle(prateleira);

        for(String carrinho: prateleira) {
            System.out.println(carrinho);
        }
    }
}
