
class Car implements Vehicle{
    @Override 
    public void start(){
        System.out.println("Car has started");
    }

    @Override 
    public void stop(){
        System.out.println("Car has stopped");
    }
}

interface Vehicle {
    void start();
    void stop();
}

public class Interface_example {
    public static void main(String[] args) {
        Vehicle obj;
        obj = new Car();
        obj.start();
        obj.stop();
    }
}
