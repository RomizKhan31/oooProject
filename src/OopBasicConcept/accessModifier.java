package OopBasicConcept;

class Person {
    private String name;  // private: accessible only within the class

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }
}

public class accessModifier{
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("This is RomizKhan");
        System.out.println(p.getName());
    }
}