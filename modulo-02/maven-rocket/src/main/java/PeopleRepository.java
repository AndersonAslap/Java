import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PeopleRepository {
    private Connection connection;

    public PeopleRepository() {
        connection = FactoryConnection.getConnection();
    }

    public List<People> getAll() {
        List<People> list = new ArrayList<>();
        try {
            String sql = "SELECT id, name, age FROM public.tb_people";
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet result = pst.executeQuery();
            while(result.next()) {
                int id = result.getInt("id");
                String name = result.getString("name");
                int age = result.getInt("age");

                People people = new People(name, age);
                people.setId(id);
                list.add(people);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return  list;
        }
    }

    public People getById(Integer id) {
        try {
            String sql = "SELECT id, name, age FROM public.tb_people WHERE id = ?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet result = pst.executeQuery();
            if (result.next()) {
                String name = result.getString("name");
                int age = result.getInt("age");

                People people = new People(name, age);
                people.setId(id);
                return people;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void create(People item) {
        try {
            String sql = "INSERT INTO public.tb_people(name, age) values (?, ?);";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, item.getName());
            pst.setInt(2, item.getAge());
            pst.execute();
            System.out.println("Registro inserido com sucesso.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(People item) {
        try {
            String sql = "UPDATE public.tb_people SET name = ?, age = ? WHERE id = ?;";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, item.getName());
            pst.setInt(2, item.getAge());
            pst.setInt(3, item.getId());
            pst.execute();
            System.out.println("Registro atualizado com sucesso.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(Integer id) {
        try {
            String sql = "DELETE FROM public.tb_people WHERE id = ?;";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1, id);
            pst.execute();
            System.out.println("Registro deletado com sucesso.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
