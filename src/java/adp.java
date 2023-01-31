public class adp {
   private final String firstname ;
    private final String lastname;
     private final String email ;
private final String gender ;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

       
     public adp(String firstname,String lastname,String email,String gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email ;
        this.gender = gender ;
       
     }
}