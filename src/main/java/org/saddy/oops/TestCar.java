package org.saddy.oops;

public class TestCar {
    public static void main(String[] args) {
        TataCar tataCar = new TataCar();
        Suzuki suzuki = new Suzuki();

        tataCar.start();
        suzuki.start();

        tataCar.running();
        suzuki.running();
    }
}
