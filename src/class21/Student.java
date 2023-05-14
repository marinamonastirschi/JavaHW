package class21;

public class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void learn() {
        System.out.println(name + " is learning");
    }

    void goesOnBreak() {
        System.out.println(name + " is having lunch");
    }

    void isTired() {
        System.out.println(name + " falls asleep");
    }
}

class SyntaxStudent extends Student {
    SyntaxStudent(String name) {
        super(name);
    }

    @Override
    void learn() {
        System.out.println(name + " is focused");
    }

    @Override
    void goesOnBreak() {
        System.out.println(name + " is having a snack");
    }

    void isWriting() {
        System.out.println("Student writes some notes");
    }
}

class CollegeStudent extends Student {
    CollegeStudent(String name) {
        super(name);
    }

    @Override
    void learn() {
        System.out.println(name + " is reading");
    }

    @Override
    void goesOnBreak() {
        System.out.println(name + " is relaxing");
    }

    void isCheating() {
        System.out.println("Student cheats on his exams");
    }
}

class SchoolStudent extends Student {
    SchoolStudent(String name) {
        super(name);
    }

    @Override
    void isTired() {
        System.out.println(name + " is tired");
    }

    @Override
    void goesOnBreak() {
        System.out.println(name + " goes on break");
    }

    void isTalking() {
        System.out.println(name + " is talking during the class");
    }
}

class StudentTester {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new SyntaxStudent("Alice");
        students[1] = new SchoolStudent("John");
        students[2] = new CollegeStudent("Robert");

        for (Student student1 : students) {
            if(student1 instanceof SyntaxStudent){
                ((SyntaxStudent)student1).isWriting();
            }
            else if(student1 instanceof SchoolStudent){
                ((SchoolStudent)student1).isTalking();
            }
            else if(student1 instanceof CollegeStudent){
                ((CollegeStudent)student1).isCheating();
            }

            student1.learn();
            student1.isTired();
            student1.goesOnBreak();

        }


    }
}
