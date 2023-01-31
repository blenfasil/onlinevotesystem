import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class vobean{ 
    public List<adp>list;  
public List<adp>getlist() throws ClassNotFoundException{
    list=new ArrayList<>();
 
    try {
      
      Statement bb;
      DBConnection obj = new DBConnection();
       Connection conn = obj.connMethod();
        bb=conn.createStatement();
        ResultSet bf=bb.executeQuery("select * from user1");
        while(bf.next()){
        String b1=bf.getString("FNAME");
        String b2=bf.getString("LNAME");
        String b3=bf.getString("EMAIL");
        String b4=bf.getString("GENDER");
  
      
      list.add(new adp(b1,b2,b3,b4));
 }
        
    } catch (SQLException ex) { 
   
    }
    return list;
}

 
}