package je02_operadores;

public class Relacionais {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        if (numero1 > numero2) {
            System.out.println("Número 1 maio que número 2");
        }

        if (numero1 < numero2) {
            System.out.println("Número 1 menor que número 2");
        }

        if (numero1 >= numero2) {
            System.out.println("Número 1 maior ou igual que número 2");
        }

        if (numero1 <= numero2) {
            System.out.println("Número 1 menor ou igual que número 2");
        }

        if (numero1 == numero2) {
            System.out.println("Número 1 igual a número 2");
        }

        if (numero1 != numero2) {
            System.out.println("Número 1 diferente de número 2");
        }
    }
}
