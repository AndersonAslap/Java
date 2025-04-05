package je05_orientacao_objeto;

import java.util.Scanner;

public class ClassesEssenciais {

    // Scanner
    // PrintStream

    // String
    // StringBuilder
    // StringBuffer

    public static void main(String[] args) {
        /*
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String name = scan.next();

        System.out.print("Digite sua idade: ");
        Integer age = scan.nextInt();

        System.out.println("Nome " + name);
        System.out.println("Idade " + age);

        System.out.println();

        */

        String _name = null;
        Integer _age = null;
        Double _weight = null;
        Double _funds = 3234.56;

        String data = "Anderson Paiva;26;100.0";

        Scanner scan2 = new Scanner(data);
        scan2.useDelimiter(";");

        int index = 0;
        while (scan2.hasNext()) {
            if (index == 0)
                _name = scan2.next();
            else if (index == 1)
                _age = Integer.valueOf(scan2.next());
            else
                _weight = Double.valueOf(scan2.next());

            index++;
        }

        System.out.println("Nome: " + _name);
        System.out.println("Idade: " + _age);
        System.out.println("Peso: " + _weight);

        // PrintStream

        System.out.printf("Nome: %s Idade: %d Peso: %.2f Renda: R$ %,.2f", _name.toLowerCase(), _age, _weight, _funds);

        // %s   -> parâmetro de tipo string
        // %d   -> parâmetro de tipo Integer / Long
        // %f   -> parâmetro de tipo Double / Float
        // .2   -> quer dizer que serão dois dígitos decimais
        // ,.2  -> quer dizer que serão dois dígitos decimais e informando o (.)
    }
}
