package collections;

import java.util.*;

public class Mapas {
    public static void main(String[] args) {
        //HashMap um mapa sem relevância quanto a ordem de interação
        System.out.println("HashMap");
        Map <String, String> estadosBrasileiros = new HashMap();
        estadosBrasileiros.put("PE", "Pernambuco");
        estadosBrasileiros.put("BA", "Bahia");
        estadosBrasileiros.put("SP", "São Paulo");
        estadosBrasileiros.put("RJ", "Rio de Janeiro");

        System.out.println("O estado que está na chave PE é : " + estadosBrasileiros.get("PE"));

        Iterator <String> keys = estadosBrasileiros.keySet().iterator();

        while (keys.hasNext()) {
            String key = keys.next();
            String value = estadosBrasileiros.get(key);
            System.out.println("UF: "+ key + " Estado: " + value);
        }

        System.out.println();

        //LinkedHashMap um mapa que mantém a ordem de inserção
        System.out.println("LinkedHashMap");
        Map <String, String> estadosBrasileiros2 = new LinkedHashMap<>();
        estadosBrasileiros2.put("PE", "Pernambuco");
        estadosBrasileiros2.put("BA", "Bahia");
        estadosBrasileiros2.put("SP", "São Paulo");
        estadosBrasileiros2.put("RJ", "Rio de Janeiro");

        Iterator <String> keys2 = estadosBrasileiros2.keySet().iterator();

        while (keys2.hasNext()) {
            String key = keys2.next();
            String value = estadosBrasileiros2.get(key);
            System.out.println("UF: "+ key + " Estado: " + value);
        }

        System.out.println();

        //TreeMap um mapa capaz de classificar as chaves pela ordem natural
        System.out.println("TreeMap");
        Map <String, String> estadosBrasileiros3 = new TreeMap<>();
        estadosBrasileiros3.put("PE", "Pernambuco");
        estadosBrasileiros3.put("BA", "Bahia");
        estadosBrasileiros3.put("SP", "São Paulo");
        estadosBrasileiros3.put("RJ", "Rio de Janeiro");

        Iterator <String> keys3 = estadosBrasileiros3.keySet().iterator();

        while (keys3.hasNext()) {
            String key = keys3.next();
            String value = estadosBrasileiros3.get(key);
            System.out.println("UF: "+ key + " Estado: " + value);
        }
    }
}
