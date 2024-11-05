package org.saddy;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] num1, num2; //declaration
        num1 = new int[]{1, 3, 66};

        int []num3 = {10, 20, 5, 30, 45, 3};
        int num4[] = {10, 20, 10, 30}; //c-type declaration. Not recommended in Java
        num2 = new int[5]; // when we dont knwo the data is going to be in the array. In this approch its going to
//        store the default values.

        System.out.println(Arrays.toString(num3));
        System.out.println(Arrays.toString(num4));

//        fetching data
        System.out.println(num3[2]);
        num3[0] = 34;
        System.out.println(Arrays.toString(num3));
        System.out.println(num3.length);
        for (int num : num3){
            if (num % 2 == 0)
                System.out.println(num + " is even.");
        }
//        find out the max value from Array num3
        int max = num3[0];
        for (int num : num3){
            if (num > max)
                max = num;
        }

        System.out.println("Max number is: " + max);
        Arrays.sort(num3);
        System.out.println(Arrays.toString(num3));
//        Value as a Reference:
        int[] newArray;
        newArray = num3;

        System.out.println(Arrays.toString(newArray));
        newArray[1] = 10;
        System.out.println("new array" + Arrays.toString(newArray));
        System.out.println("num3: " + Arrays.toString(num3));
    }
}
