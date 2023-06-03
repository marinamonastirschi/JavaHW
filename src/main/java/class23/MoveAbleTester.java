package class23;

public class MoveAbleTester {
    public static void main(String[] args) {
        MoveAble moveAble = new Cat();
        WashAble washAble= new Dog();
        washAble.wash();
        MoveAble[] moveAbles = {new Cat(), new Dog(), new Horse()};
        for (MoveAble a : moveAbles) {
            a.move();
        }
    }
}
