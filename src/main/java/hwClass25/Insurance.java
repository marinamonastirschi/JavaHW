package hwClass25;

public abstract class Insurance {
    String insuranceName;
    abstract void getQuote();
    abstract void cancelInsurance();

}
class Car extends  Insurance{
    String carModel;

    @Override
    void getQuote() {

    }

    @Override
    void cancelInsurance() {

    }
}
class Pet extends Insurance{
    String petType;


    @Override
    void getQuote() {

    }

    @Override
    void cancelInsurance() {

    }
}
class Health extends Insurance{

    @Override
    void getQuote() {

    }

    @Override
    void cancelInsurance() {

    }
}
class InsuranceTester{
    public static void main(String[] args) {
        Insurance[] insurance={new Car(),new Pet(),new Health()};
        for(Insurance ins:insurance){
            ins.cancelInsurance();
            ins.getQuote();
        }
    }
}
