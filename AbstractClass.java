abstract class Shape{
    public abstract double calculateArea();
}

class Circle extends Shape{
    private double radius;
    
    public Circle(double radius){
        this.radius= radius;
    }
    public double calculateArea(){
        return 3.14 * radius * radius;
    }
}

class Square extends Shape{
    private double side;

    public Square(double side){
        this.side= side;
    }
    public double calculateArea(){
        return side * side;
    }
}
class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(double base, double height){
        this.base= base;
        this.height= height;
    }

    public double calculateArea(){
        return 0.5 * base * height;
    }
}

 public class AbstractClass {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Area of Circle: " + circle.calculateArea());

        Square square = new Square(4);
        System.out.println("Area of Square: " + square.calculateArea());

        Triangle triangle = new Triangle(3, 6);
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
    
}
