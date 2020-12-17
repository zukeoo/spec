import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class GetData {
    public static void Get() {
        try {
            Class.forName("com.mysql.jdbc,Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/main_base","root","");
            Statement st = conn.createStatement();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM uczen WHERE id_ucznia = 0487231571");
            while (rs.next()){
                System.out.print(rs);
            }
        }
        catch (Exception error){
            System.err.println("Wystapil blad");
            System.err.println(error.getMessage());
        };
    }
}