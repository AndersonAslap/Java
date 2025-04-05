package je03_documentacao;

/**
 * Calculadora Simples
 * @author Anderson Paiva
 * @since v1.0
 * */
public class Calculadora {

    /**
     * Realiza a divisão entre dois números inteiros
     *
     * @param dividendo     Número que será dividido
     * @param divisor       Número que irá dividir o dividendo
     * @author              Anderson Paiva
     * @exception           java.lang.ArithmeticException em caso de passar o divisor igual a zero 0.
     * */
    Integer dividir(Integer dividendo, Integer divisor){
        return dividendo / divisor;
    }
}
