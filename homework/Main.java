package homework;

public class Main {
    public static void main(String[] args) {


        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        Shape triangle = new Triangle(3.0, 7.0);

        Shape[] shapes = {circle, rectangle, triangle};
        for (Shape shape : shapes) {
            System.out.println(shape.getInfo() + " - Area: " + shape.calculateArea());
        }


        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");
        Animal bird = new Bird("Tweety");

        Animal[] animals = {dog, cat, bird};
        for (Animal animal : animals) {
            System.out.println(animal.getInfo() + " - Sound: " + animal.makeSound() + " - Food: " + animal.eat());
        }
    }
}
