import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
@RequestScoped
public class uuser implements Serializable {

    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String user;
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getGenderList() {
        return genderList;
    }

    public void setGenderList(List<String> genderList) {
        this.genderList = genderList;
    }


    List<String> genderList;


    public uuser() {
        genderList = new ArrayList<>();
        
         genderList.add("Male");
        genderList.add("Female");
        
      
    }
    public void Insert() {
      
        try {
            
         
            DBConnection dbcon = new DBConnection();
            Connection con = dbcon.connMethod();
            String sql = "Insert into USER1(FNAME,LNAME,EMAIL,PASSWORD,GENDER) values(?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, firstName);
             ps.setString(2, lastName);
            ps.setString(3, email);
            ps.setString(4, password);
            ps.setString(5, gender);
           
            ps.executeUpdate();
            String sql1 = "Insert into ETOVOTE(USER_NAME,PASSWORD,EMAIL,USER_TYPE) values(?,?,?,?)";
            PreparedStatement ps1 = con.prepareStatement(sql1);
            ps1.setString(1,user);
            ps1.setString(2, password);
             ps1.setString(3, email);
            ps1.setString(4, "user");
            ps1.executeUpdate();
            System.err.println("success");
        } catch (ClassNotFoundException | SQLException e) {
        }
    }

}
