package collections;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List languages = new ArrayList();
        languages.add("Java");
        languages.add("C#");
        languages.add("Node");
        languages.add("React");
        languages.add("Node");
        languages.add(3, "php");

        System.out.println("A linguagem no índice 0 é: " + languages.get(0));
        System.out.println("A linguagem C# está na posição: " + languages.indexOf("C#"));
        System.out.println("Comprimento atual: " + languages.size());

        for(Object language: languages) {
            System.out.println(language);
        }
    }
}
