class demo {
    String color;
    int speed;

    void drive() {
        System.out.println("Car is driving...");
    }
}

public class Car{
    public static void main(String[] args) {
        demo myCar = new demo(); // object creation
        myCar.color = "Red";
        myCar.speed = 100;
        myCar.drive();
        System.out.println("Color : " + myCar.color);
        System.out.println("Speed : " + myCar.speed);
    }
}