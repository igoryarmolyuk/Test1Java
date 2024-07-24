package homework;


abstract class Shape {
    abstract double calculateArea();
    abstract String getInfo();
}


class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    String getInfo() {
        return "Circle with radius: " + radius;
    }
}


class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }

    @Override
    String getInfo() {
        return "Rectangle with width: " + width + " and height: " + height;
    }
}


class Triangle extends Shape {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    String getInfo() {
        return "Triangle with base: " + base + " and height: " + height;
    }
}
