package class29;

import java.util.ArrayList;
import java.util.List;

public class E6Methods {
    public static void main(String[] args) {
        E6Methods obj = new E6Methods();
        BankAccount bankAccount = new BankAccount(20);
        obj.print(bankAccount);
    }

    void print(BankAccount bankAccount) {
        bankAccount.withdraw(10);
    }
}
