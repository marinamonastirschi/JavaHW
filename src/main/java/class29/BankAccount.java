package class29;

public class BankAccount {
double balance;
 public BankAccount(double balance){
    this.balance=balance;
}
public void withdraw(double amountToWithdraw){
    if(amountToWithdraw>balance){
        System.out.println("Not possible insufficient balance");
    }
    balance=balance - amountToWithdraw;
}
}
