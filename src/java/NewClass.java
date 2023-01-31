import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
@ManagedBean
@SessionScoped
public class NewClass implements Serializable {
  private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   

    public String method1() throws SQLException, ClassNotFoundException {
        boolean bol = NewClass1.mmM(username, password);
        if (bol) {
              DBConnection dbcon = new DBConnection();
              Connection con = dbcon.connMethod();
            PreparedStatement ps = con.prepareStatement("select USER_TYPE from ETOVOTE where USER_NAME=?");
            ps.setString(1, username);       
            ResultSet rs = ps.executeQuery();
            rs.next();
            String user4 =rs.getString(1);
            if ("ADMIN".equals(user4)) {
                return "AD";
            } else {
                return "FORM";
            }
        } else {
            return "adminlogin";
        }
    }


 
}