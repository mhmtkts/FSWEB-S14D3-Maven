package org.example.arge;

public class MainCarSkeleton {
    public static void main(String[] args) {
        CarSkeleton gaspowered = new GasPoweredCar("renault","clio",15,20 );

        CarSkeleton hybrid = new HybridCar("opel","astra",10,50,20);

        CarSkeleton elektric = new ElectricCar("tesla","model y",600,1500);

        startEngine(gaspowered);
        startEngine(hybrid);
        startEngine(elektric);

    }
    public static void startEngine(CarSkeleton carSkeleton) {
        System.out.println(carSkeleton.startEngine());
    }
}
