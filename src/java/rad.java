
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import static java.time.Clock.system;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
@RequestScoped
public class rad implements Serializable {

    private String party;
    
   

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }
    public List<String> getpartyList() {
  
        return partyList;
    }

    public void setpartyList(List<String> partyList) {
        this.partyList = partyList;
    }
 List<String> partyList;

   


    public rad() {
        partyList = new ArrayList<>();

         partyList.add("የመላው ኢትዮጵያ አንድነት ድርጅት ");

        partyList.add("የኢትዮጵያ ዴሞክራቲክ ኅብረት ");
        partyList.add("ኢትዮጵያ ብሔራዊ አንድነት ፓርቲ ");
        partyList.add("የኦሮሞ ፌዴራላዊ ኮንግረስ ");
        partyList.add("የኦሮሞ ፌዴራላዊ ኮንግረስ ");
        partyList.add("አዲስ ትውልድ ፓርቲ ");
        partyList.add("የኢትዮጵያ ሶሻል ዲሞክራቲክ ፓርቲ ");
        partyList.add("የአማራ ብሔራዊ ንቅናቄ ");
        partyList.add("የኦሮሞ ነፃነት ንቅናቄ ");
        partyList.add("የኦሮሞ ነፃነት ግንባር ");
        partyList.add("የኦጋዴን ብሔራዊ ነፃነት ግንባር ");
        partyList.add(" ነፃነትና እኩልነት ፓርቲ ");
        partyList.add("ኅብር ኢትዮጵያ ዴሞክራሲያዊ ፓርቲ ");
        partyList.add("ብልፅግና ፓርቲ ");
        
       
      
    }
    public void Inert() throws SQLException {
      
        try {
            
         
            DBConnection dbcon = new DBConnection();
            Connection con = dbcon.connMethod();
            String sql = "Insert into USER2(PARTYNAME) values(?)";
            PreparedStatement ps = con.prepareStatement(sql);
            String partyName = null;
            ps.setString(1, party);
             
            ps.executeUpdate();
            
            System.err.println("success");
        } catch (ClassNotFoundException | SQLException e) {
        }
}
}