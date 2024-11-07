package org.saddy;

import java.util.Scanner;
import java.util.SortedMap;

public class JavaRecap2 {

    public static void main(String[] args) {
        byte age = 100;

        byte age1 = -128;
        short num = 32767;
        int num1 = 444444444;
        long num2 = 44444444444444444L;

//        System.out.println(age);
////        Mathemetical opetors: +, -, /(return: quetent), %(return-> reminders)
//        System.out.println((13/4));
//        System.out.println((13%4));
//        Logical operators: <, <=, >=, ==, &&, ||, !=,
//        ternary operator: ?:
         print();
        }

        static void print(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num = scanner.nextInt();
            int age = num < 0 ? 0 : num;

            System.out.println("Your age is :" + age);
        }
}
//short 2^16 -> 657XX