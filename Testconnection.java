package testconnection;
import java.sql.*;
public class Testconnection {
    public static void main(String[] args) {
        String url="jdbc:oracle:thin:@localhost:1521:XE";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver Loaded Successfully");
            Connection con = DriverManager.getConnection(url, "system", "atan1");
            System.out.println("Connection Established");
            //To Do
            con.close();
        }catch(ClassNotFoundException e)
        {
            System.out.println("Driver Not Loaded");
        }catch (SQLException s)
        {
            System.out.println("SQL Connection Could Not Be Established");
        }
    }
}
