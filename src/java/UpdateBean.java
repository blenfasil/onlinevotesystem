import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;


@ManagedBean
public class UpdateBean {
    private String email;
       private String FNAME;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFNAME() {
        return FNAME;
    }

    public void setFNAME(String FNAME) {
        this.FNAME = FNAME;
    }

    

   
    
    
    
    public void upDate() throws ClassNotFoundException{
      try{
      
       DBConnection dbcon = new DBConnection();
            Connection con = dbcon.connMethod();
      
          String sql = "UPDATE USER1 SET FNAME=? WHERE email=?";
           
             PreparedStatement ps = con.prepareStatement(sql);
 
           ps.setString(1, FNAME);     
                
                  ps.setString(3, email);
                   
            ps.executeUpdate();
            
      }
      catch(SQLException e )
      
      {
      
      System.out.print(e);
      
      }
       
  }
}