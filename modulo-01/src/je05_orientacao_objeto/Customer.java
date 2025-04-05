package je05_orientacao_objeto;

public class Customer {
    String name;
    Double creditLimit = 100.0;

    public void RequestCreditLimit(Double newCreditLimit){
        this.creditLimit = newCreditLimit;
    }

    public void Buy(Double productValue){
        if (productValue <= this.creditLimit) {
            this.creditLimit -= productValue;
        } else {
            System.out.println("Limite insuficiente para esta compra.");
        }
    }
}
