package class2;

public class Variables {
    public static void main(String[] args) {
        String firstName="Marina";
        String lastName="Monastirschi";
        char grade='A';
        String city="Chicago";
        String state="Illinois";
        String phoneNumber="111-555-6847";
        System.out.println("My name is " +firstName+"" + " and my last name is " +lastName+".");
        System.out.println("I am "+grade+" student");
        System.out.println("I live in "+ city+"," + state+".");
        System.out.println("And my phone number is "+ phoneNumber+".");

        city="Wisconsin Dells";
        state="Wisconsin";
        phoneNumber="222-444-8888";
        grade='B';
        System.out.println(" My name is "+ firstName+ " and I moved to "+ city+ ", "+ state+"."+" My new phone number is "+ phoneNumber+".");
        System.out.println("I am "+grade+" student"+".");
    }
}
