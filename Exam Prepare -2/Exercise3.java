package org.example;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Car> carMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] inputs = scanner.nextLine().split("\\|");
            String name = inputs[0];
            int mileage = Integer.parseInt(inputs[1]);
            int fuel = Integer.parseInt(inputs[2]);
            Car car = new Car(name, mileage, fuel);
            carMap.put(name, car);
        }

        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            String[] commands = command.split(" : ");
            switch (commands[0]) {
                case "Drive":
                    String carName = commands[1];
                    int distance = Integer.parseInt(commands[2]);
                    int fuel = Integer.parseInt(commands[3]);
                    Car car = carMap.get(carName);
                    if (car.getFuel() >= fuel) {
                        car.setMileage(car.getMileage() + distance);
                        car.setFuel(car.getFuel() - fuel);
                        carMap.put(carName, car);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.\n",
                                carName, distance, fuel);
                    } else {
                        System.out.println("Not enough fuel to make that ride");
                    }
                    if (car.getMileage() >= 100000) {
                        carMap.remove(carName);
                        System.out.printf("Time to sell the %s!\n", carName);
                    }
                    break;
                case "Refuel":
                    String carName1 = commands[1];
                    int fuel1 = Integer.parseInt(commands[2]);
                    Car car1 = carMap.get(carName1);
                    int refuel = car1.getFuel() + fuel1;
                    if (refuel > 75) {
                        System.out.printf("%s refueled with %d liters\n", carName1, 75 - car1.getFuel());
                        car1.setFuel(75);
                    } else {
                        System.out.printf("%s refueled with %d liters\n", carName1, fuel1);
                        car1.setFuel(refuel);
                    }
                    break;
                case "Revert":
                    String carName2 = commands[1];
                    int mileage2 = Integer.parseInt(commands[2]);
                    Car car2 = carMap.get(carName2);
                    int revertedMileage = car2.getMileage() - mileage2;
                    if (revertedMileage >= 10000) {
                        System.out.printf("%s mileage decreased by %d kilometers\n", carName2, mileage2);
                    } else {
                        revertedMileage = 10000;
                    }
                    car2.setMileage(revertedMileage);
                    break;
            }
            command = scanner.nextLine();
        }

        for (Map.Entry<String, Car> car : carMap.entrySet()) {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.\n",
                    car.getValue().getName(), car.getValue().getMileage(), car.getValue().getFuel());
        }
    }

    public static class Car {
        private String name;
        private int mileage;
        private int fuel;

        public Car(String name, int mileage, int fuel) {
            this.name = name;
            this.mileage = mileage;
            this.fuel = fuel;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getMileage() {
            return mileage;
        }

        public void setMileage(int mileage) {
            this.mileage = mileage;
        }

        public int getFuel() {
            return fuel;
        }

        public void setFuel(int fuel) {
            this.fuel = fuel;
        }
    }

}
