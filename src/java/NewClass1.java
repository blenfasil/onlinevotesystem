
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class NewClass1 {
    public static boolean mmM(String name, String password) {
        boolean status = false;
        try {
            DBConnection ob = new DBConnection();
            Connection c = ob.connMethod();
            PreparedStatement ps = c.prepareStatement("select * from ETOVOTE where USER_NAME=? and PASSWORD=?");
            ps.setString(1, name);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            status = rs.next();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
         
        }
        return status;
    }
}
