package hWclass14;

public class Task2 {
    /*Create a method createEmail(). Based on values of users firstName,
     lastName and email type, your method should return complete email Address.
     Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
     */
    String createEmail(String firstName,String lastName,String emailType){
        return firstName.toLowerCase()+lastName.toLowerCase()+"@"+emailType+"."+"com";
    }

    public static void main(String[] args) {
        Task2 obj=new Task2();
        String userName= obj.createEmail("Marina","Monastirschi","gmail");
        System.out.println(userName);
    }
}
