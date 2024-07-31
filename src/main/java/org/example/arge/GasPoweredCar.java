package org.example.arge;

public class GasPoweredCar extends CarSkeleton{

    private double avgKmPerLiter;
    private int cylinders;


    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAverageKmPerLiter() {
        return avgKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String startEngine() {
        runEngine(this);
        return getName() + " car starting";
    }

    @Override
    public String drive() {

        return getName() + " car driving";
    }

    @Override
    public String toString() {
        return "GasPoweredCar{" +
                "avgKmPerLiter=" + avgKmPerLiter +
                ", cylinders=" + cylinders +
                '}';
    }
}
