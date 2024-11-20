package org.saddy.oops;

public abstract class CAR {

    public int maxSpeed = 200;

    public abstract void start();
    public abstract void breakCar();


    public void running() {
        System.out.println("Running");
    }
}
