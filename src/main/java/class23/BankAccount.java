package class23;

public class BankAccount {
    String firstName;
    private String userName;
    private String password;
    private double accountBalance = 120;

    public BankAccount(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    String getFirstName(){
        return firstName;
    }

    public double getAccountBalance(String password) {
        if (password.equals(this.password)) {
            return accountBalance;
        } else {
            return 0;
        }
    }
    public void setAccountBalance(double balance){
        accountBalance=balance;
    }
    void setPassword(String password){
        this.password=password;
    }
}
class BankTester{
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount("user123","password");
        System.out.println(bankAccount.getAccountBalance("password"));
        bankAccount.setAccountBalance(100000);
        System.out.println(bankAccount.getAccountBalance("password"));
    }
}