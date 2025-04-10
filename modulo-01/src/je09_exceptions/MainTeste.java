package je09_exceptions;

public class MainTeste {
    public static void main(String[] args) {
        unCheckEstado("PE");

        try {
            checkEstado("PE");
        } catch (EstadoValidateException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void unCheckEstado(String nomeEstado) throws EstadoValidateRuntimeException {
        if(!nomeEstado.equals("PI"))
            throw new EstadoValidateRuntimeException();
        System.out.println("Bem vindo!");
    }

    static void checkEstado(String nomeEstado) throws EstadoValidateException {
        if(!nomeEstado.equals("PI"))
            throw new EstadoValidateException();
        System.out.println("Bem vindo!");
    }
}

/*
* Exceções checadas obrigam a utilização do try/catch porém as exceções não checada, não obrigam.
*
* Exception : Checada
* RuntimeException : Não checada
*
* Seguir a ordem de prescedência da hierarquia de execções
* */