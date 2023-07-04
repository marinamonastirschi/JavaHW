package hwClass28;

public class Task {
    static void checkAge(int age) throws Exception{
        if(age<16){
            throw new Exception("age is less than 16");
        }
    }
    static void checkUserName(String userName) throws Exception{
        int chars= userName.length();
        if(chars<5){
            throw new Exception("username is less than 5 characters");
        }
    }
}
