class Vehicle {
    int speed;
    int wheels;

    Vehicle(int speed, int wheels) {
        this.speed = speed;
        this.wheels = wheels;
    }

    void drive() {
        System.out.println("The vehicle is driving at a speed of " + speed + " km/h on " + wheels + " wheels.");
    }
}

class Car extends Vehicle {
    String make;
    String model;

    Car(String make, String model, int speed, int wheels) {
        super(speed, wheels);
        this.make = make;
        this.model = model;
    }

    void startEngine() {
        System.out.println("The " + make + " " + model + " engine is started.");
    }
}

public class inheritance_main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 100, 4);

        myCar.startEngine();
        myCar.drive();
    }
}
