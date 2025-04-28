package OopBasicConcept;

interface Lion {
    void sound();
}

class snack implements Lion {
    public void sound() {
        System.out.println("roar!!!");
    }
}

public class Interface {
    public static void main(String[] args) {
        snack c = new snack();
        c.sound();
    }
}