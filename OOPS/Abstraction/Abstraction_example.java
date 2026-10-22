
abstract class Vehicle {

    int NumOfTyres;

    void displayTyres() {
        System.out.println("The vehicle has " + NumOfTyres + " tyres.");
    }

    abstract void start();
}

class Car extends Vehicle {

    @Override
    void start() {
        NumOfTyres = 4;
        System.out.println("Car starts with a key.");
    }
}

class Bike extends Vehicle {

    @Override
    void start() {
        NumOfTyres = 2;
        System.out.println("Bike starts with a Kick.");
    }
}

public class Abstraction_example {

    public static void main(String[] args) {
        Vehicle obj;

        obj = new Bike();
        obj.start();
        obj.displayTyres();

        obj = new Car();
        obj.start();
        obj.displayTyres();

    }
}
