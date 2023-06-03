package hwClass20;

import class18.A;

public class CreditCard {
    double balance=15000;
    double interest=2.5;

    void calculateInterest(){
        System.out.println(balance*interest);
    }
}
class Visa extends CreditCard{

}
class AX extends CreditCard{
    @Override
    void calculateInterest() {
        System.out.println("unknown");
    }
}
class CreditCardTester{
    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard();
        creditCard.calculateInterest();
        Visa visa=new Visa();
        visa.calculateInterest();
        AX ax=new AX();
        ax.calculateInterest();
    }
}
