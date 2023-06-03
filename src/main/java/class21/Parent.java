package class21;

public class Parent {
    final static int noOfMonthsInYear=12;
   final void getMarry(){
        System.out.println("Marry Shakira");
    }
    void study(){
        System.out.println("Study medicine");
    }
}
class Axel extends Parent{
    final int noOfHoursInDay=24;
    @Override
    void study(){
        System.out.println(noOfMonthsInYear);
        System.out.println("No I want SDET");
    }
}
