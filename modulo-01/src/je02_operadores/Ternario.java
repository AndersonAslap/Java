package je02_operadores;

public class Ternario {
    public static void main(String[] args) {
        String nome = "Anderson";
        int idade = 26;
        final int MAIOR_IDADE = 18;
        boolean maiorIdade = idade >= MAIOR_IDADE;
        String message = nome.concat(maiorIdade ? " é de maior" : " não é de maior");

        System.out.println(message);
    }
}
