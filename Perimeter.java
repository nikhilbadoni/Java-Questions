import java.util.Scanner;

public class Perimeter{
    public double calculatePerimeter(int side){
        return 4* side;
    }
    
    public double calculatePerimeter(double length, double width){
        return 2 * (length + width);
    }

    public double calculatePerimeter(double radius){
        return 2 * (22.0/7) * radius;
    }

    public static void main(String args[]){
        Perimeter perimeter= new Perimeter();
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the side length of Square");
        int squareSide= sc.nextInt();
        double squarePerimeter= perimeter.calculatePerimeter(squareSide);
        System.out.println("\nPerimeter of Square : " + squarePerimeter);

        System.out.println("\nEnter the length of Rectangle");
        double rectangleSide= sc.nextDouble();
        System.out.println("Enter the width of Rectangle");
        double rectangleWidth= sc.nextDouble();
        double rectanglePerimeter= perimeter.calculatePerimeter(rectangleSide,rectangleWidth);
        System.out.println("\nPerimeter of Rectangle : " + rectanglePerimeter);

        System.out.println("\nEnter the radius of Circle");
        double circleRadius= sc.nextDouble();
        double circlePerimeter= perimeter.calculatePerimeter(circleRadius);
        System.out.println("\nPerimeter of Circle : " + circlePerimeter);
        sc.close();
    }
}