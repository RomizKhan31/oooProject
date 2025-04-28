package OopBasicConcept;

class Animal {
    protected String type = "OopBasicConcept.Animal";

    void display() {
        System.out.println("This is an animal.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println(type + " says, Hambaaaaaa....!");
    }
}

public class inheritanceAndProtected {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
        d.bark();
    }
}