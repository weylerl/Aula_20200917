package Teste01;

public class Car extends Vehicle {
    private int seatingCapacity;
    private double topSpeed;
 
    public Car(String make, String model, int seatingCapacity, double topSpeed) {
        super(make, model);
        this.seatingCapacity = seatingCapacity;
        this.topSpeed = topSpeed;
    }
 
    // no-arg constructor, getters and setters
}