package oops_practice;

class Car{
    private String brand;
    private String model;
    private boolean isEngineOn = false;
    private int currentSpeed = 0;
    private int currentGear = 0;
    private String tyreCompany;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public int getCurrentSpeed() {
        return currentSpeed;
    }
    public String gettyreCompany() {
        return tyreCompany;
    }

    public void settyreCompany(String tyreCompany) {
        this.tyreCompany = tyreCompany;
    }
    public void start() {
        isEngineOn = true;
        currentSpeed = 0;
        System.out.println(brand + " " + model + " : Engine starts with a roar!");
    }
    public void shiftGear(int gear) {
        if(!isEngineOn) {
            System.out.println("Cannot shift gear, engine is off.");
            return;
        }
        this.currentGear = gear;
        if (gear < 1 || gear > 6) {
            System.out.println("Invalid gear. Please select a gear between 1 and 6.");
            return;
        }   
        if (gear == 1) {
            currentSpeed = 0; // Reset speed when shifting to first gear
        } else if (gear > currentGear) {
            currentSpeed += 20; // Increase speed by 20 km/h for each gear shift up
        } else {
            currentSpeed -= 20; // Decrease speed by 20 km/h for each gear shift down
        }
        if (currentSpeed < 0) {
            currentSpeed = 0; // Prevent negative speed
        }
        System.out.println("Current speed: " + currentSpeed + " km/h");
    }
    public void accelerate(int speed) {
        if(!isEngineOn) {
            System.out.println("Cannot accelerate, engine is off.");
            return;
        }
        currentSpeed += speed;
        System.out.println("Accelerating to " + currentSpeed + " km/h");
    }
    public void brake() {
        if(!isEngineOn) {
            System.out.println("Cannot brake, engine is off.");
            return;
        }
        if (currentSpeed > 0) {
            currentSpeed -= 10; // Decrease speed by 10 km/h on brake
            if (currentSpeed < 0) {
                currentSpeed = 0; // Prevent negative speed
            }
            System.out.println("Braking. Current speed: " + currentSpeed + " km/h");
        } else {
            System.out.println("Already at a stop.");
        }
    }
    public void stop() {
        if(!isEngineOn) {
            System.out.println("Cannot stop, engine is off.");
            return;
        }
        isEngineOn = false;
        currentSpeed = 0;
        currentGear = 0;
        System.out.println(brand + " " + model + " : Engine stopped.");
    }
    


}
public class Encapsulation {
    public static void main(String[] args) {
        sportsCar myCar = new sportsCar("Ferrari", "488 GTB");
        myCar.start();
        myCar.shiftGear(1);
        myCar.accelerate(50);
        myCar.shiftGear(2);
        myCar.accelerate(70);
        myCar.brake();
        myCar.stop();
        System.out.println("Current Speed: " + myCar.getCurrentSpeed() + " km/h");
    }
}
