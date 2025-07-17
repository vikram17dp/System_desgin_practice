package oops_practice;


interface Car {
    void start();
    void shiftGear(int gear);
    void accelerate(int speed);
    void brake();
    void stop();
    
}

class sportsCar implements Car {
    String brand;
    String model;
    boolean isEngineOn = false;
    int currentSpeed = 0;
    int currentGear = 0;

    public sportsCar(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    @Override
    public void start() {
        isEngineOn = true;
        currentSpeed = 0;
        System.out.println(brand + " " + model + " : Engine starts with a roar!");
    }

    @Override
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

    @Override
    public void accelerate(int speed) {
        if(!isEngineOn) {
            System.out.println("Cannot accelerate, engine is off.");
            return;
        }
        if (speed < 0) {
            System.out.println("Speed cannot be negative.");
            return;
        }
        currentSpeed += speed;
        if (currentSpeed > 200) { // Assuming a max speed limit for sports cars
            currentSpeed = 200;
            System.out.println("Max speed reached: 200 km/h");
        }   

        System.out.println("Sports car accelerating to " + speed + " km/h");
    }

    @Override
    public void brake() {
        currentSpeed -= 20;
        if(currentSpeed < 0) {
            currentSpeed = 0; // Prevent negative speed
        }
        System.out.println(brand + " " + model + " : Braking! Speed is now " + currentSpeed + " km/h");
    }

    @Override
    public void stop() {
    if(!isEngineOn) {
            System.out.println("Engine is already off.");
            return;
        }
        isEngineOn = false;
        currentSpeed = 0;
        currentGear = 0;
     System.out.println(brand + " " + model + " : Engine turned off.");
    }
}
public class Abstractions{
    public static void main(String[] args) {
        Car myCar = new sportsCar("bentley", "continental GT");
        myCar.start();  
        myCar.shiftGear(2);
        myCar.accelerate(30);
        myCar.shiftGear(3);
        myCar.accelerate(50);
        myCar.shiftGear(4);
        myCar.accelerate(70);
        myCar.shiftGear(5);
        myCar.accelerate(100);
        myCar.brake();
        myCar.stop();
    }
}
