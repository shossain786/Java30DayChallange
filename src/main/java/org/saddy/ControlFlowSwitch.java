package org.saddy;

// write a calculator program based on user input perform the operation
// Write a program for displaying the bill amount of user shopping. Discount will be applied for shopping >1000 is 5%, >5000 is 10, >10000 is 15%
// You need to print the total purchased amount after discount.
import java.util.Scanner;

public class ControlFlowSwitch {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


            calculator();
    }

    static void calculator() {
        boolean run = true;
        while (run) {
            System.out.println("Please select the option from below: \n" +
                    "1. Add\n" +
                    "2. Subtraction\n" +
                    "3. Multiplication\n" +
                    "4. Division\n" +
                    "5. Reminder\n" +
                    "6. Exit");
            int operator = scanner.nextInt();
            if (operator == 6) {
                System.out.println("Termination the Calculator");
                System.exit(0);
            }

            System.out.println("Enter the first number:");
            int num1 = scanner.nextInt();
            System.out.println("Enter the second number:");
            int num2 = scanner.nextInt();

            switch (operator){
                case 1:
                    System.out.println("Sum of the numbers " + num1 + " and " + num2 + " is:" + (num1+num2));
                    break;
                case 2:
                    System.out.println("Subtraction of the numbers " + num1 + " and " + num2 + " is:" + (num1-num2));
                    break;
                case 3:
                    System.out.println("Multiplication of the numbers " + num1 + " and " + num2 + " is:" + (num1*num2));
                    break;
                case 4:
                    System.out.println("Division of the numbers " + num1 + " and " + num2 + " is:" + (num1/num2));
                    break;
                case 5:
                    System.out.println("Reminder of the numbers " + num1 + " and " + num2 + " is:" + (num1 % num2));
                    break;
                default:
                    System.out.println("Please select a valid option from the above");
            }
    }

    }
}
