package org.saddy;

import java.util.Scanner;

public class Operators {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        calculate();
//        display();
//        comparatorEx();
        useOfTernaryOperator();
    }

    static void useOfTernaryOperator(){
        System.out.println("Enter a number: ");
        int num1 = scanner.nextInt();
        int age;
//        age = num1 <= 0 ? 1 : num1;

        age = num1 >= 140 ? 120 : num1;

        System.out.println("Person Age Entered: " + age);
    }

    public static void comparatorEx(){
        System.out.println("Enter a number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter another number: ");
        int num2 = scanner.nextInt();

        System.out.println("Operation: == " + (num1==num2));  // return true if both the side are equals, else return false
        System.out.println("Operation: > " + (num1>num2));
        System.out.println("Operation: < " + (num1<num2));
        System.out.println("Operation: >= " + (num1>=num2));
        System.out.println("Operation: <= " + (num1<=num2));
        System.out.println("Operation: != " + (num1 != num2));
    }

    public static void display() {
        System.out.println("Enter a number: ");
        int num1 = scanner.nextInt();
        System.out.println(num1++);
        System.out.println(++num1);  //35

        System.out.println(num1--);  // 35
        System.out.println(--num1);  // 33
    }

    public static void calculate() {
        System.out.println("Enter a number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter another number: ");
        int num2 = scanner.nextInt();
        System.out.println("Sum of the numbers is: " + (num1 + num2));
        System.out.println("Subtraction of the numbers is: " + (num1 - num2));
        System.out.println("Multiplication of the numbers is: " + (num1 * num2));
        System.out.println("Division of the numbers is: " + (num1 / num2));  // quotient value
        System.out.println("Modulus of the numbers is: " + (num1 % num2));  // reminder of division
    }
}
