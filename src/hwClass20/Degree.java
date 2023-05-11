package hwClass20;

public class Degree {
    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors extends Degree{

}
class Masters extends Degree{
    @Override
    void getPrerequisite() {
        System.out.println("To get a degree you need bachelors diploma");
    }
}
class DegreeTester{
    public static void main(String[] args) {
        Degree degree=new Degree();
        Bachelors bachelor=new Bachelors();
        Masters masters=new Masters();
        degree.getPrerequisite();
        bachelor.getPrerequisite();
        masters.getPrerequisite();
    }
}
