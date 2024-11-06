package org.saddy;

public class JavaRecap {
    static int num = 10;
    static String sub = "Java";       // instance/global/class variable(its do not have the static keyword)

    static int a; //declaration

    public static void main(String[] args) {
        int x = 10;  // Local variable
        System.out.println(sub);
       
//        a = 20;  // initialization

        int b = 0;
        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }

    void displayName() {
        String name = "Saddam";
        System.out.println(sub);
//        System.out.println(x);
    }

    public static void printMessage() {
//        System.out.println(name);
//        System.out.println(x);
        System.out.println(num);
    }
}
