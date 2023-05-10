package hwClass18;

public class Teacher {
    private String firstName;
    private String lastName;

    Teacher(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }


   void explaining(){
        System.out.println(firstName+" "+lastName+" is explaining today's topic");
    }
    void writing(){
        System.out.println(firstName+" "+lastName+" is writing in notes");
    }
    void checkingHomeWork(){
        System.out.println(firstName+" "+lastName+" is checking students homework");
    }
    void solvingTasks(){
        System.out.println(firstName+" "+lastName+" is solving task1");
    }

}
class MathTeacher extends Teacher{

    MathTeacher(String firstName, String lastName) {
        super(firstName, lastName);
    }
}
class ChemitryTeacher extends Teacher{

    ChemitryTeacher(String firstName, String lastName) {
        super(firstName, lastName);
    }
}
class PianoTeacher extends Teacher{

    PianoTeacher(String firstName, String lastName) {
        super(firstName, lastName);
    }
}
class TeacherTester{
    public static void main(String[] args) {
        new MathTeacher("John","Smith").checkingHomeWork();
        new ChemitryTeacher("Alice","Seagal").explaining();


    }
}
