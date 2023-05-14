package hwClass21;

public class Computer {
    String name;
    String color;
    double memory;

    Computer(String name, String color, double memory){
        this.name=name;
        this.color=color;
        this.memory=memory;
    }

    void isStarting(){
        System.out.println(name+" is starting and working");
    }

}
class Apple extends Computer{
    Apple(String name, String color, double memory){
        super(name,color,memory);
    }
    @Override
    void isStarting(){
        System.out.println(color+" "+name+" is opening with a password");
    }
    void isShuttingDown(){
        System.out.println(color+" "+name+" is shut down");
    }
}
class Lenovo extends Computer{
    Lenovo(String name, String color, double memory){
        super(name, color, memory);
    }
    @Override
    void isStarting(){
        System.out.println(name+" is having an error when starting");
    }
    void getError(){
        System.out.println(name+" "+color+" with memory "+memory+" gets error *out of memory*");
    }
}
class HP extends Computer{
    HP(String name, String color, double memory){
        super(name, color, memory);
    }
    @Override
    void isStarting(){
        System.out.println(name+" is opening with FaceID");
    }
    void working(){
        System.out.println(name+" "+color+" is working properly");
    }
}
class Dell extends Computer{
    Dell(String name, String color, double memory){
        super(name, color, memory);
    }
    @Override
    void isStarting(){
        System.out.println("Press the start button");
    }
    void runsTheProgram(){
        System.out.println(name+" working in Intellij");
    }
}
class ComputerTester{
    public static void main(String[] args) {
        Computer[] computer={new Apple("Apple","Gray",24),new Lenovo("Lenovo","Black",16),new HP("HP","Brown",24),new Dell("Dell","Gold",16)};
        for(Computer comp:computer){
            if(comp instanceof Apple){
                ((Apple)comp).isShuttingDown();
            }
            else if(comp instanceof Lenovo){
                ((Lenovo)comp).getError();
            }
            else if(comp instanceof HP){
                ((HP)comp).working();
            }
            else if(comp instanceof Dell){
                ((Dell)comp).runsTheProgram();
            }
            comp.isStarting();
        }
    }
}
