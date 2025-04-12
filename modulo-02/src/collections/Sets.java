package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {

        // a medida que vai adicionando os elementos vão se organizando e garante a não duplicidade
        System.out.println("HashSet");
        Set languages = new HashSet();
        languages.add("Java");
        languages.add("C#");
        languages.add("Node");
        languages.add("React");
        languages.add("Node");

        System.out.println("Comprimento atual: " + languages.size());

        for(Object language: languages) {
            System.out.println(language);
        }

        System.out.println();

        // mantém a ordem e garante a não duplicidade
        System.out.println("LinkedHashSet");
        Set languages2 = new LinkedHashSet();
        languages2.add("Java");
        languages2.add("C#");
        languages2.add("Node");
        languages2.add("React");
        languages2.add("Node");

        System.out.println("Comprimento atual: " + languages2.size());

        for(Object language: languages2) {
            System.out.println(language);
        }

        System.out.println();

        // Garante a não duplicidade e organiza de acordo com algorítmo natural
        // exemplo se for string vai por ordem alfabetica

        System.out.println("TreeSet");
        Set languages3 = new TreeSet();
        languages3.add("Java");
        languages3.add("C#");
        languages3.add("Node");
        languages3.add("React");
        languages3.add("Node");

        System.out.println("Comprimento atual: " + languages3.size());

        for(Object language: languages3) {
            System.out.println(language);
        }
    }
}
