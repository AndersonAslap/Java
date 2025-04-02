package je02_operadores;

public class Logicos {
    public static void main(String[] args) {
        boolean condition1 = true;
        boolean condition2 = false;

        if (condition1 && condition2) {
            System.out.println("Ambas condições são verdadeiras");
        }

        if (condition1 || condition2) {
            System.out.println("Existe uma ou mais condições verdadeiras");
        }

        // nesse caso ele verifica a segunda condição mesmo se a primeira for falsa
        if (condition1 & condition2) {
            System.out.println("Ambas condições são verdadeiras");
        }
    }
}
