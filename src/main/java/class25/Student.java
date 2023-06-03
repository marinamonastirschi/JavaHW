package class25;

public class Student {
    String name;
    String ID;
    int age;

    public Student(String name, String ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", age=" + age +
                '}';
    }
}
class StudentTester{
    public static void main(String[] args) {
        Student student= new Student("Lean","123",125);
        System.out.println(student);
    }
}
