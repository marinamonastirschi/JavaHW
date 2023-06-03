package hwClass25;

import java.util.LinkedList;

public class Card {
    double interestRate;
    String cardType;

    public Card(double interestRate, String cardType) {
        this.interestRate = interestRate;
        this.cardType = cardType;
    }
    void m1(){
        System.out.println();
    }
    void m2(){
        System.out.println();
    }

    public static void main(String[] args) {
        Card card1= new Card(25.7,"Visa");
        Card card2= new Card(23.6,"MasterCard");
        Card card3= new Card(24.6,"American Express");

        LinkedList<Card> cards= new LinkedList<>();
        for(Card card: cards){
            card.m1();
            card.m2();
        }
    }
}
