abstract class Vehicle{
    abstract void start();
}

class Car extends Vehicle{
    void start(){
        System.out.println("Car starts with key");
    }
}

class Scooter extends Vehicle
{
    void start()
    {
        System.out.println("Scooter starts with kick");
    }
    public static void main(String[] args) {
        Car c=new Car();
        c.start();
        System.out.println("______________________");
        System.out.println();
        Scooter s=new Scooter();
        s.start();
    }
}