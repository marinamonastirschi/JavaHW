package groupProject;

public class Registration {
    private String email;
    private String userName;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
class RegistrationTester{
    public static void main(String[] args) {
        Registration obj=new Registration();
        obj.setEmail("yahoo");
        System.out.println(obj.getEmail());
        obj.setPassword("abracadabra");
        System.out.println(obj.getPassword());
        obj.setUserName("User123");
        System.out.println(obj.getUserName());


    }
}
