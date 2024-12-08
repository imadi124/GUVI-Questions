import java.util.*;

interface Shape {
    double area();
    double perimeter();
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ShapeType = sc.next();
        sc.nextLine(); // To clear the buffer
        Shape shape;

        if (ShapeType.equalsIgnoreCase("Rectangle")) {
            double length = sc.nextDouble();
            double width = sc.nextDouble();
            shape = new Rectangle(length, width);
        } else if (ShapeType.equalsIgnoreCase("Circle")) {
            double radius = sc.nextDouble();
            shape = new Circle(radius);
        } else {
            System.out.println("Invalid shape type");
            return;
        }

        System.out.println("Area: " + shape.area());
        System.out.println("Perimeter: " + shape.perimeter());
        sc.close();
    }
}
