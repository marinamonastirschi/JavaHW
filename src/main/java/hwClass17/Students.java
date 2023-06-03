package hwClass17;

import hWclass14.Student;

public class Students {
    String name;
    int grade1;
    int grade2;
    int grade3;

    public Students(String name, int grade1, int grade2, int grade3) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        System.out.println(name+" "+avGrade());
    }
    int avGrade(){
        return (grade1+grade2+grade3)/3;
    }


    }
