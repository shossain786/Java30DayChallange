package org.saddy;

import java.util.Scanner;

public class ControlFlow {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        gradingSystem();
    }

    static void gradingSystem(){
        System.out.println("Enter Student Number:");
        int number = scanner.nextInt();
//        if (number > 100) {
//            System.out.println("Number can not be greater than 100. Please try again.");
//            System.exit(0);
//        } else if (number < 0) {
//            System.out.println("Number can not be lesser than 0. Please try again.");
//            System.exit(0);
//        }

        if (number < 0 || number > 100) {
            System.out.println("Please enter a number in range of 0-100.");
            System.exit(0);
        }

        if (number >= 90) {
            System.out.println("Grade is: A++");
        } else if (number >= 80) {
            System.out.println("Grade is: A");
        } else if (number >= 70) {
            System.out.println("Grade is: B++");
        } else if (number >= 60) {
            System.out.println("Grade is: B");
        } else if (number >= 30) {
            System.out.println("Grade is: C");
        } else {
            System.out.println("Grade is: F");
        }
    }
}
