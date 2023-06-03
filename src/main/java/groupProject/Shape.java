package groupProject;

public interface Shape {

    /*Create an Interface 'Shape' with undefined methods as calculateArea
and calculatePerimiter. Create 2 classes Circle & Square that
implements functionality defined in the Shape Interface. Test your
code.
     */
    double p=3.14159265;
    void calculateArea(double a);
    void calculatePerimeter(double b);
}
class Circle implements Shape{


    @Override
    public void calculateArea(double r) {
        System.out.println("Area of this circle is :"+r*r);
    }

    @Override
    public void calculatePerimeter(double r) {
        System.out.println("Perimeter of this circle is :"+2*p*r);
    }
}
class Square implements Shape{


    @Override
    public void calculateArea(double side) {
        System.out.println("The area of this square is :"+side*side);
    }

    @Override
    public void calculatePerimeter(double side) {
        System.out.println("The perimeter of this square is :"+4*side);
    }
}
class ShapeTester{
    public static void main(String[] args) {
        Square obj=new Square();
        obj.calculateArea(5);
        obj.calculatePerimeter(5);

        Circle obj1=new Circle();
        obj1.calculateArea(2);
        obj1.calculatePerimeter(2);
    }
}
