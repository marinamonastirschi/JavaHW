package hwclass19;

public class Area {
     void calculateArea(int w,int l){
        System.out.println(w*l);
    }
     void calculateArea(int a){
        System.out.println(a*2);
    }
}
class AreaTester{
    public static void main(String[] args) {
        Area obj=new Area();
        obj.calculateArea(4,8);
        obj.calculateArea(5);
    }
}
