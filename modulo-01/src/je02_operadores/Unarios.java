package je02_operadores;

public class Unarios {
    public static void main(String[] args) {
        int numero = +5;
        System.out.println(-numero);
        System.out.println(numero);

        int numero2 = -5;
        System.out.println(numero);
        System.out.println(numero * -1); // 5

        numero++; // equivalente a numero = numero + 1;
        System.out.println(numero);

        ++numero; // equivalente a numero = numero + 1; porém a atualização é de forma antecipada a processamentos posteriores
        System.out.println(numero);

        boolean verdadeira = true;
        boolean falso = !verdadeira;

        // ! operador unário de negação
    }
}
