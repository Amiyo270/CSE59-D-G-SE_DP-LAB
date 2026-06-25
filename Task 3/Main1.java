import javax.swing.undo.StateEdit;

public class Main1 {

    public static void main(String[] args){
        User user = new User("AMIYO ", "amiyo--@gmail.com");

        UserRepository repository = new UserRepository();
        repository.save(user);
    }

}


class User {
     private String username;
     private String email;

     public User( String username, String email){
        this.username = username;
        this.email = email;
     }

     public String getUsername(){
        return username;
     }

     public String getEmail(){
        return email;
     }


    
}

class EmailValidation {

    public static boolean isValid(String email){
        if (email != null && email.contains("@")){
            return true;
        }

        System.out.println("Invalid email format");
        return false;
    }
    
}






 class UserRepository{

    public void save(User user) {
        if (EmailValidation.isValid(user.getEmail())){
            System.out.println("Connecting to Database....");
            System.out.println(
                "Saving user " + user.getUsername()
                + "To the users table."
            );
        }

    }

}
