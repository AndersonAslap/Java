package je05_orientacao_objeto.enums;

/*
* Enums: Objetos imutáveis disponíveis na aplicação
* */

public class StatesSystem {
    public static void main(String[] args) {
        // instancia um enum
        BrazilStates _district = BrazilStates.PE;
        System.out.println(_district.name());
        System.out.println(_district.getName());
        System.out.println(_district.getUf());

        System.out.println();

        // pega um enum pelo name
        BrazilStates _district2 = BrazilStates.valueOf("SP");
        System.out.println(_district2.name());
        System.out.println(_district2.getName());
        System.out.println(_district2.getUf());

        System.out.println();

        // lista todos os enums
        for(BrazilStates _district3: BrazilStates.values()) {
            System.out.println(_district3.name());
            System.out.println(_district3.getName());
            System.out.println(_district3.getUf());
            System.out.println();
        }
    }
}
