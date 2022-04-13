import java.security.PrivateKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private static String URL = "jdbc:postgresql://localhost/test";
    private static String USER = "postgres";
    private static String PASSWORD = "qwerty";



        public static Connection connect() {
            Connection connection = null;
         try {

        connection = DriverManager.getConnection(URL, USER, PASSWORD);
        System.out.println("Połączono");

    }catch(SQLException e){
             e.printStackTrace();

    }
         return connection;
    }
}
