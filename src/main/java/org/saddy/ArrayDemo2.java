package org.saddy;

import java.util.Arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
////        declaration
//        int[] age, num;
//        String names[];
//        String []arrays;
////   initialization
//        age = new int[100];
//        int[] num1 = new int[10];
//        int[] num2 = new int[]{10, 23, 4, 50}; //
//        String[] names1 = {"Jadav", "Saurav"};
//
//        num1[4] = 13;
//
//        System.out.println(Arrays.toString(num1));
//        System.out.println(Arrays.toString(num2));
//        System.out.println(Arrays.toString(names1));
//        System.out.println(num1[4]);
//        num1[4] = 12;
//        System.out.println(num1[4]);
//        System.out.println(Arrays.toString(num1));
//        System.out.println(num1.length);
        int[] nums = {10, 23, 4, 50};
//        int[] num1 = {10, 23, 4, 50};
        System.out.println(nums);
        arrayUseCases(nums);
//        System.out.println(">>>>>>>>>>" + nums);
        System.out.println("Original Array: " + Arrays.toString(nums));

    }

// call by reference
    static void arrayUseCases(int[] array){
        int[] ages;
        ages = array;
        int[] ages1 = ages;

        System.out.println(Arrays.toString(ages));
        ages1[1] = 44;

        System.out.println(Arrays.toString(ages));
        System.out.println(Arrays.toString(ages1));

        int[] num2 = array.clone();
        System.out.println(num2);
        System.out.println(Arrays.equals(num2, ages));
        System.out.println(num2 == ages);
        num2[1] = 67;
        System.out.println(num2[1]);
        System.out.println(ages[1]);
        System.out.println(Arrays.toString(num2));
        Arrays.sort(num2);
        System.out.println(Arrays.equals(num2, ages));
        System.out.println(Arrays.toString(num2));
    }
}
