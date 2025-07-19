package oops_practice2;

class ElectricCar extends Car {
        private int batteryLevel;

        ElectricCar(String brand, String model, int year) {
            super(brand, model, year);
            this.batteryLevel = 100; // Full battery by default
        }

        public void chargeBattery(int amount) {
            if (amount > 0 && batteryLevel + amount <= 100) {
                batteryLevel += amount;
                System.out.println("Battery charged to " + batteryLevel + "%.");
            } else {
                System.out.println("Invalid charge amount or battery is already full.");
            }
        }

        public void displayBatteryLevel() {
            System.out.println("Current battery level: " + batteryLevel + "%");
        }
    }