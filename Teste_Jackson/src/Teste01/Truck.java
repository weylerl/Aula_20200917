package Teste01;

public class Truck extends Vehicle {
    private int seatingCapacity;
    private double topSpeed;
 
    public Truck(String make, String model, int seatingCapacity, double topSpeed) {
        super(make, model);
        this.seatingCapacity = seatingCapacity;
        this.topSpeed = topSpeed;
    }
 
    // no-arg constructor, getters and setters
}