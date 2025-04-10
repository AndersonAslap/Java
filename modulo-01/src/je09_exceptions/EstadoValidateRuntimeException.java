package je09_exceptions;

public class EstadoValidateRuntimeException  extends  RuntimeException{
    public EstadoValidateRuntimeException() {
        super("O estado não foi localizado.");
    }
}
