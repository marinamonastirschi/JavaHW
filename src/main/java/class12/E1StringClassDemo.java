package class12;

public class E1StringClassDemo {
    public static void main(String[] args) {
        //ClassName objectName= new ClassName();
        String string=new String("leandro");
       String string1="Ana"; //Most widely used one
        System.out.println(string1.length()); //There are 3 letters in Ana
        String name="Axel";
        if(name.length()>8) {
            System.out.println("Only 8 characters are allowed");
        }
    }
}
