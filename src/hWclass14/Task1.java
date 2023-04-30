package hWclass14;

public class Task1 {
    /*Create a method that will say Hello in different language based on the country that will passed
    when method is executed.
     */
    void sayHello(String country){
        switch (country){
            case "Moldova":
                System.out.println("Salut");
                break;
            case "USA":
                System.out.println("Hello");
                break;
            case "Italy":
                System.out.println("Ciao");
                break;
            case "France":
                System.out.println("Bounjour");
                break;

        }

    }

    public static void main(String[] args) {
        Task1 obj=new Task1();
        obj.sayHello("Moldova");
        obj.sayHello("Italy");
    }
}
