package homework;


interface Animal {
    String makeSound();
    String eat();
    String getInfo();
}


abstract class Pet implements Animal {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    @Override
    public String getInfo() {
        return "Pet: " + name;
    }
}


class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Bark";
    }

    @Override
    public String eat() {
        return "Dog food";
    }
}


class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Meow";
    }

    @Override
    public String eat() {
        return "Cat food";
    }
}


class Bird implements Animal {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public String makeSound() {
        return "Chirp";
    }

    @Override
    public String eat() {
        return "Bird seeds";
    }

    @Override
    public String getInfo() {
        return "Bird: " + name;
    }
}
