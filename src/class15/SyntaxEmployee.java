package class15;

public class SyntaxEmployee {
    String empId;
    int salary;
    static String CEO="Sumair";

    public static void main(String[] args) {
        SyntaxEmployee asghar=new SyntaxEmployee();
        SyntaxEmployee asel=new SyntaxEmployee();
        asghar.empId="123";
        asel.empId="1234";
        asghar.salary=50000;
        asel.salary=40000;
        System.out.println("The ID of the first person is "+asghar.empId+" and salary is "+asghar.salary+"."+" CEO is "+SyntaxEmployee.CEO);
        System.out.println("The ID of the second person is "+asel.empId+" and salary is "+asel.salary+"."+" CEO is "+SyntaxEmployee.CEO);

    }
}
