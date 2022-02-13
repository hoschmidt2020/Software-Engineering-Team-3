//---------------------------------------------------------------------------------------|
/**
 *  University of Arkansas | Software Engineering (Spring 2022) | Mr. Strother | Team 3
 *  Change Date: February 13th, 2022 (Henry Schmidt)
 *  DBService Class: Control our connection with the PostgreSQL database and passes
 *  information to the classes that need it 
 */
//---------------------------------------------------------------------------------------|
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBService {
    
    DBService(){

    }

    // private static Connection getConnection() throws URISyntaxException, SQLException {
    //     URI dbUri = new URI(System.getenv("DATABASE_URL"));
    
    //     String username = dbUri.getUserInfo().split(":")[0];
    //     String password = dbUri.getUserInfo().split(":")[1];
    //     String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + dbUri.getPath();
    
    //     return DriverManager.getConnection(dbUrl, username, password);
    // }

    private static Connection getConnection() throws URISyntaxException, SQLException {
        String dbUrl = System.getenv("JDBC_DATABASE_URL");
        return DriverManager.getConnection(dbUrl);
    }

    public void test(){
        try {
            getConnection();
        } catch (URISyntaxException | SQLException e) {
            e.printStackTrace();
        }
    }
}
