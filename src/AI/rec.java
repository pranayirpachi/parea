package AI;

import java.util.Scanner;

class Shape {
    public int length;
    public int width;

    public Shape(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int area() {
        return length * width;
    }

    public int perimeter() {
        return 2 * (length + width);
    }
}

class Rectangle extends Shape {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    public int getArea() {
        return area();
    }

    public int getPerimeter() {
        return perimeter();
    }
}

public class rec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length = sc.nextInt();
        System.out.print("Enter width: ");
        int width = sc.nextInt();

        Rectangle shape = new Rectangle(length, width);

        System.out.println("Area: " + shape.getArea());
        System.out.println("Perimeter: " + shape.getPerimeter());
    }
}
