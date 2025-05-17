
import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person p) throws Exception {
        String name = p.getName();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("C:\\Praktikum Java\\Praktikum 10", "root", "");
        String query = "INSERT INTO person(name) VALUES ('" + name + "')";
        System.out.println(query);
        Statement s = conn.createStatement();
        s.executeUpdate(query);
        conn.close();
    }
}
    

