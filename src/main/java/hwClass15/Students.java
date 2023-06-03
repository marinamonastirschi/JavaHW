package hwClass15;

public class Students {
    String name;
    String ID;
    static int numberOfStudents;

    public static void main(String[] args) {
        Students obj1=new Students();
        Students obj2=new Students();
        Students obj3=new Students();

        obj1.name="Alice";
        obj1.ID="A01";
        numberOfStudents++;
        obj2.name="John";
        obj2.ID="A02";
        numberOfStudents++;
        obj3.name="Emily";
        obj3.ID="A03";
        numberOfStudents++;

        System.out.println(numberOfStudents);




    }
}
