
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class DEBEAN {
   private String EMAIL;

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    
    public void remove() throws ClassNotFoundException, SQLException{
     DBConnection dbcon = new DBConnection();
              Connection con = dbcon.connMethod();
             String del="delete from USER1 where EMAIL='"+EMAIL+"' ";
         
    PreparedStatement ps = con.prepareStatement(del);  
     
    ps.executeQuery(del);
  
    }
}
