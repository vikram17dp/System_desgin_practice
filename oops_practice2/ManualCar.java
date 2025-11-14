package oops_practice2;

public class ManualCar extends Car {
        private int currentGear;

        ManualCar(String brand, String model, int year) {
            super(brand, model, year);
            this.currentGear = 1; // Default gear
        }
        public void changeGear(int gear) {
            if (gear > 0 && gear <= 5) { // Assuming a 5-speed manual car
                currentGear = gear;
                System.out.println("Changed to gear " + currentGear);
            } else {
                System.out.println("Invalid gear. Please select between 1 and 5.");
            }
        }

        
    } 
