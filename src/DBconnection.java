import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
    private static final String URL = "jdbc:mysql://localhost:3306/studentmangementsystem";
    private static final String USER = "root";
    private static final String PASS = "Rooth@123";
    public static Connection getConnection(){
            Connection con = null;
            try{
                con = DriverManager.getConnection(URL,USER,PASS);
            } catch(Exception e){
                System.out.print(e);
        }
            return con;
    }
}
