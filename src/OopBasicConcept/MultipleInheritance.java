package OopBasicConcept;

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("OopBasicConcept.Duck is flying...");
    }

    public void swim() {
        System.out.println("OopBasicConcept.Duck is swimming...");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Duck d = new Duck();
        d.fly();
        d.swim();
    }
}