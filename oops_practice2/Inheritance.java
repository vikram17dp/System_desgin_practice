package oops_practice2;

public class Inheritance {
    public static void main(String[] args) {
        ManualCar manualCar = new ManualCar("Toyota", "Corolla", 2020);
        manualCar.startEngine();    
        manualCar.accelerate(50);
        manualCar.changeGear(2);
        manualCar.brake(20);
        manualCar.stopEngine();
        System.out.println();
        ElectricCar electricCar = new ElectricCar("Tesla", "Model S", 2021);
        electricCar.startEngine();  
        electricCar.accelerate(60);
        electricCar.chargeBattery(20);
        electricCar.displayBatteryLevel();
        electricCar.brake(30);
        electricCar.stopEngine();
        System.out.println();
    }
    
}
