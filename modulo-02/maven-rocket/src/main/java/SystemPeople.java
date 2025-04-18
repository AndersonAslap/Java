import java.util.List;

public class SystemPeople {
    public static void main(String[] args) {
        FactoryConnection.connect();
        PeopleRepository repository = new PeopleRepository();

        People people = repository.getById(3);

        System.out.println(people.getName());
    }
}
