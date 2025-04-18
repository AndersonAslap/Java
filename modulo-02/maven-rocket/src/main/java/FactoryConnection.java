import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class FactoryConnection {
    private static Connection connection;

    public static void connect() {
        try {
            if (connection == null) {
                String url = "jdbc:postgresql://localhost:5432/db_rocket";

                Properties props = new Properties();
                props.setProperty("user", "anderson");
                props.setProperty("password", "anderson#1998");

                connection = DriverManager.getConnection(url, props);

                System.out.println("Conexão realizada com sucesso!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}
