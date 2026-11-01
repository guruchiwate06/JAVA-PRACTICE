package AJP1;
import java.sql.*;


/**
 *
 * @author Rajguru
 */
public class DBConnect {
    public Connection dbCon(){
        Connection ct = null;
        final String url = "jdbc:mysql://localhost:3306/ajp";
        final String user = "root";
        final String password = "YOUR_DATABASE_PASSWORD";
        try{
            ct = DriverManager.getConnection(url, user, password);
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        return ct;
    }
}
