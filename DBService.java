
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

    //Creating a player in the database
    //Use SQL commands to modifiy the database with these methods
    public void create_player(int id, String first_name, String last_name, String codename){
        
        // Pseudo:

        //Statement statement = conn.createStatement();
        //ResultSet rs = stmt.executeQuery("
        //INSERT INTO table_name (c1, c2, ...)
        //VALUES (id, first_name, last_name, codename);
        //");
    }

    //Removing a player in the Database
    public void remove_player(int id){

        // Pseudo:

        //Statement statement = conn.createStatement();
        //ResultSet rs = stmt.executeQuery("
        //DELETE FROM table_name WHERE col"id" = id;
        //");

    }

    //Modifing a player in the Database
    public void modify_player(int id, String first_name, String last_name, String codename){
        
        // Pseudo:

        //Statement statement = conn.createStatement();
        //ResultSet rs = stmt.executeQuery("
        //UPDATE table_name
        //SET c1 = first_name, c2 = last_name, c3 = codename
        //WHERE id = (ex.);
        //");
        
        
        
    }
}
