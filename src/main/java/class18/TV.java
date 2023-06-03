package class18;

public class TV {
    int size;
    protected String make;
    String model;

}
class AppleTV extends TV{


}
class TVTester{
    public static void main(String[] args) {
        AppleTV ap=new AppleTV();
    }
}
