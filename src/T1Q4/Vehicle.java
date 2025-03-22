/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T1Q4;

/**
 *
 * @author Dawna Dowe
 */
public abstract class Vehicle {
    double maxSpeed;
    protected double currentSpeed;

    public Vehicle(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
    abstract void accelerate();

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }
    
    void pedalToTheMedal(double maxSpeed, double currentSpeed){
        while(maxSpeed != currentSpeed){
            accelerate();
        }
    }
}

//to create instance of vehicle, need to make subclass
