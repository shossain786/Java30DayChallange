package org.saddy;

import java.util.ArrayList;

public class JavaRecap3 {
    public static void main(String[] args) {
        int x =  100;
        long y = x;
        int a1 = 150;

        byte a = 10;
        int z = a;
        System.out.println(z);

        byte b = (byte) x;  //explicit/narrowing
        System.out.println("b: " + b);

        byte a2 = (byte) a1;
        System.out.println("a2: " + a2);

        int c =10;
        Integer d = c;  //Auto-boxing
        System.out.println(d);
        Integer d1 = 20;

        int d2 = d1;
        System.out.println(d2);
        ArrayList<Integer> arrayList;

//        byte y = x;
    }
}
