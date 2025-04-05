package je05_orientacao_objeto;

public class BuySystem {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.name = "Anderson Paiva";
        customer.RequestCreditLimit(200.0);

        System.out.println(customer.name);
        System.out.println(customer.creditLimit);

        Customer customer2 = new Customer();
        customer2.name = "Rany";
        customer2.RequestCreditLimit(150.0);

        System.out.println(customer2.name);
        System.out.println(customer2.creditLimit);
    }
}