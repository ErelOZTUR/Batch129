package project;

public class Vehicle {


    private String make;

    private String model;

    private String fuelType;

    private String gear;

    private double dailyfee;

    public Vehicle(String make, String model, String fuelType, String gear, double dailyfee) {
        this.make = make;
        this.model = model;
        this.fuelType = fuelType;
        this.gear = gear;
        this.dailyfee = dailyfee;
    }

    public String getMake() {

        return make;
    }

    public void setMake(String make) {

        this.make = make;
    }

    public String getModel() {

        return model;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public String getFuelType() {

        return fuelType;
    }

    public void setFuelType(String fuelType) {

        this.fuelType = fuelType;
    }

    public String getGear() {

        return gear;
    }

    public void setGear(String gear) {

        this.gear = gear;
    }

    public double getdDailyfee() {

        return dailyfee;
    }

    public void setDailyfee(double dailyfee) {

        this.dailyfee = dailyfee;
    }
}
