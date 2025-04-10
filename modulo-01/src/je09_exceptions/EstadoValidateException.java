package je09_exceptions;

public class EstadoValidateException extends Exception {
    public EstadoValidateException() {
        super("O estado não foi localizado.");
    }
}
