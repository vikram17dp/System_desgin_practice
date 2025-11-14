package oops_practice2;


public class Car{
   protected String brand;
  protected  String model;
   protected boolean isEngineOn;
    protected int currentSpeed;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.isEngineOn = false; // Engine is off by default
        this.currentSpeed = 0; // Speed is 0 by default
    }

    public void startEngine() {
        if (!isEngineOn) {
            isEngineOn = true;
            System.out.println("Engine started.");
        } else {
            System.out.println("Engine is already on.");
        }
    }
    public void stopEngine() {
        if (isEngineOn) {
            isEngineOn = false;
            currentSpeed = 0; // Reset speed when engine is turned off
            System.out.println("Engine stopped.");
        } else {
            System.out.println("Engine is already off.");
        }
    }
    public void accelerate(int speed) {
        if (isEngineOn) {
            currentSpeed += speed;
            System.out.println("Accelerated to " + currentSpeed + " km/h.");
        } else {
            System.out.println("Cannot accelerate. Start the engine first.");
        }
    }
    public void brake(int speed) {
        currentSpeed -= 20;
        if (currentSpeed < 0) currentSpeed = 0;
        System.out.println(brand + " " + model + " : Braking! Speed is now " + currentSpeed + " km/h");
    }
    
    
}

