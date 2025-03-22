/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T1Q4;

/**
 *
 * @author Dawna Dowe
 */
public class Car extends Vehicle {

    public Car(double maxSpeed) {
        super(maxSpeed);
        this.currentSpeed=0;
    }
    
    @Override
    void accelerate(){
        currentSpeed += 10;
        if (currentSpeed > maxSpeed){
            currentSpeed = maxSpeed;
        }
        System.out.println("Current speed: "+currentSpeed+" km/h");
    }    
}
