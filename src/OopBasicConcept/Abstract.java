package OopBasicConcept;

abstract class Tiger {
    abstract void makeSound();

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Cat extends Tiger {
    void makeSound() {
        System.out.println("Meow!Meow!!");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Cat d = new Cat();
        d.makeSound();
        d.sleep();
    }
}