import java.util.*;

public class Vehicle1 {
    public static void main(String[] args) {

        Car car = new Car("TN01AB1234", "Toyota", 1000);
        Bike bike = new Bike("TN02CD5678", "Honda", 500);
        Truck truck = new Truck("TN03EF9012", "Tata", 2000);

        RentalAgency agency = new RentalAgency();

        agency.addVehicle(car);
        agency.addVehicle(bike);
        agency.addVehicle(truck);

        System.out.println("Car Rental:");
        agency.generateBill("TN01AB1234", 3);

        System.out.println("\nTruck Rental:");
        agency.generateBill("TN03EF9012", 2);

        System.out.println("\nBike Rental:");
        agency.generateBill("TN02CD5678", 4);
    }
}


abstract class Vehicle {

    String vehicleNumber;
    String brand;
    double baseRate;

    abstract double calculateRentalCost(int days);

    Vehicle(String vehicleNumber, String brand, double baseRate) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Base Rate: " + baseRate);
    }
}


interface Insurable {

    double getInsuranceCost();
}


class Car extends Vehicle implements Insurable {

    Car(String vehicleNumber, String brand, double baseRate) {
        super(vehicleNumber, brand, baseRate);
    }

    @Override
    double calculateRentalCost(int days) {
        return baseRate * days;
    }

    @Override
    public double getInsuranceCost() {
        return 200;
    }
}


class Bike extends Vehicle {

    Bike(String vehicleNumber, String brand, double baseRate) {
        super(vehicleNumber, brand, baseRate);
    }

    @Override
    double calculateRentalCost(int days) {
        return baseRate * days;
    }
}


class Truck extends Vehicle implements Insurable {

    Truck(String vehicleNumber, String brand, double baseRate) {
        super(vehicleNumber, brand, baseRate);
    }

    @Override
    double calculateRentalCost(int days) {
        return (baseRate * days) + 500;
    }

    @Override
    public double getInsuranceCost() {
        return 500;
    }
}


class RentalAgency {

    List<Vehicle> vehicles = new ArrayList<>();

    void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    void generateBill(String vehicleNumber, int days) {

        for (Vehicle vehicle : vehicles) {

            if (vehicle.vehicleNumber.equals(vehicleNumber)) {

                double rentalCost = vehicle.calculateRentalCost(days);

                System.out.println("Vehicle Number: " + vehicle.vehicleNumber);
                System.out.println("Brand: " + vehicle.brand);
                System.out.println("Days: " + days);
                System.out.println("Rental Cost: " + rentalCost);

                if (vehicle instanceof Insurable) {

                    Insurable insurableVehicle = (Insurable) vehicle;

                    double insuranceCost = insurableVehicle.getInsuranceCost();

                    System.out.println("Insurance Cost: " + insuranceCost);
                    System.out.println("Total Cost: "
                            + (rentalCost + insuranceCost));

                } else {

                    System.out.println("Insurance: Not required");
                    System.out.println("Total Cost: " + rentalCost);
                }

                return;
            }
        }

        System.out.println("Vehicle not found.");
    }
}