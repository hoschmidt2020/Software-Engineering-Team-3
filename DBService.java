
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

    private final String url = "jdbc:postgresql://ec2-35-175-68-90.compute-1.amazonaws.com:5432/da1l74klnmbaus?password=d0c5b2a8fb21acb46bd2f2046696c971d61b24a42206531ddfcb6552e5eb4e76&sslmode=require&user=ujdocfowronvnp";
    private final String user = "ujdocfowronvnp";
    private final String password = "d0c5b2a8fb21acb46bd2f2046696c971d61b24a42206531ddfcb6552e5eb4e76";

    DBService() {

    }

    // private static Connection getConnection() throws URISyntaxException, SQLException {
    // URI dbUri = new URI(System.getenv("DATABASE_URL"));

    // String username = dbUri.getUserInfo().split(":")[0];
    // String password = dbUri.getUserInfo().split(":")[1];
    // String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + dbUri.getPath();

    // return DriverManager.getConnection(dbUrl, username, password);
    // }

    private Connection getConnection() {
       
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

    public void test() {
        getConnection();
    }

    // //Creating a player in the database
    // //Use SQL commands to modifiy the database with these methods
    // public create_player(int id, String first_name, String last_name, String codename){
    // }

    // //Removing a player in the Database
    // public remove_player(int id){
    // }

    // //Modifing a player in the Database
    // public modify_player(int id){
    // }
}
