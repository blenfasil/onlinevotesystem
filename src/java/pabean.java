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
public class pabean{ 
    public List<pdp>list;  
public List<pdp>getlist() throws ClassNotFoundException{
    list=new ArrayList<>();
 
    try {
      
      Statement b;
      DBConnection obj = new DBConnection();
       Connection conn = obj.connMethod();
        b=conn.createStatement();
        ResultSet bf=b.executeQuery("select * from user2");
        while(bf.next()){
        String b1=bf.getString("PARTYNAME");
        
      
      list.add(new pdp(b1));
 }
        
    } catch (SQLException ex) { 
   
    }
    return list;
}

 
}