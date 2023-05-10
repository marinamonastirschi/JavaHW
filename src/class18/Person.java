package class18;

public class Person {
    String name;
    void sleep(){
        System.out.println("zzzZZZZzzzZZZ");
    }
}
class Employee extends Person{

}
class Tester extends Employee{

}
class PersonTester{
    public static void main(String[] args) {
        Tester tester=new Tester();
        Employee employee=new Employee();
        employee.sleep();
        tester.name="Sarah";
        tester.sleep();
    }
}