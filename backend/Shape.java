
import java.util.Scanner;

class Shape {

    public double area() {
        return 0;
    }
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {

    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return length * breadth;
    }
}

class Triangle extends Shape {

    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

public class Shape {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Shape s;

        System.out.print("Enter circle radius: ");
        double radius = sc.nextDouble();

        Circle c = new Circle(radius);

        s = c;
        System.out.println("Area of Circle: " + s.area());

        System.out.print("\nEnter rectangle length: ");
        double length = sc.nextDouble();

        System.out.print("Enter rectangle breadth: ");
        double breadth = sc.nextDouble();

        Rectangle r = new Rectangle(length, breadth);

        s = r;
        System.out.println("Area of Rectangle: " + s.area());

        System.out.print("\nEnter triangle base: ");
        double base = sc.nextDouble();

        System.out.print("Enter triangle height: ");
        double height = sc.nextDouble();

        Triangle t = new Triangle(base, height);

        s = t;
        System.out.println("Area of Triangle: " + s.area());

        sc.close();
    }
}
