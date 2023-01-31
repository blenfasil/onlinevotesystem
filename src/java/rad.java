
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
    
    private List<String> partyList;

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


   


    public rad() {
        partyList = new ArrayList<>();

         partyList.add("የመላው ኢትዮጵያ አንድነት ድርጅት All Ethiopian Unity Party");
System.out.println();
        partyList.add("የኢትዮጵያ ዴሞክራቲክ ኅብረት Ethiopian Democratic Union");
        partyList.add("ኢትዮጵያ ብሔራዊ አንድነት ፓርቲ Ethiopian National Unity Party");
        partyList.add("የኦሮሞ ፌዴራላዊ ኮንግረስ Oromo Federalist Congress");
        partyList.add("የኦሮሞ ፌዴራላዊ ኮንግረስ Oromo Federalist Congress");
        partyList.add("አዲስ ትውልድ ፓርቲ New Generation Party");
        partyList.add("የኢትዮጵያ ሶሻል ዲሞክራቲክ ፓርቲ Ethiopian Social Democratic Party");
        partyList.add("የአማራ ብሔራዊ ንቅናቄ National Movement of Amhara");
        partyList.add("የኦሮሞ ነፃነት ንቅናቄ Oromo Liberation Movement");
        partyList.add("የኦሮሞ ነፃነት ግንባር Oromo Liberation Front");
        partyList.add("የኦጋዴን ብሔራዊ ነፃነት ግንባር Ogaden National Liberation Front");
        partyList.add(" ነፃነትና እኩልነት ፓርቲ Freedom and Equality Party");
        partyList.add("ኅብር ኢትዮጵያ ዴሞክራሲያዊ ፓርቲ Hibir Ethiopia Democratic Party");
        partyList.add("ብልፅግና ፓርቲ Prosperity Party");
        partyList.add("የኢትዮጵያ ዜጎች ለማኅበራዊ-ፍትህ ፓርቲ Ethiopian Citizens for Socialbr\n" +
"Justice Party");
       
    }
    public void Inert() throws SQLException {
      
        try {
            
         
            DBConnection dbcon = new DBConnection();
            Connection con = dbcon.connMethod();
            String sql = "Insert into USER2(partyNAME) values(?)";
            PreparedStatement ps = con.prepareStatement(sql);
            String partyName = null;
            ps.setString(1, party);
             
            ps.executeUpdate();
            
            System.err.println("success");
        } catch (ClassNotFoundException | SQLException e) {
        }
}
}