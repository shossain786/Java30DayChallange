package org.saddy;

public class JavaRecapeLoop {
    public static void main(String[] args) {
//        for (int i = 0; i < 50 ; i++) {
//            if (i % 2 == 0)
//                System.out.println(i);  //print even numbers only
//        }

//        outerLoop:
//        for (int i = 0; i < 10; i++) {
//            anotherLoop:
//            for (int j = 10; j > 0; j--) {
//                if (i == 5 && j == 5)
//                    break outerLoop;
//                System.out.println("i: " + i+ " j: " + j);
//            }
//        }
//
//        int[] array = new int[] {10, 23, 4, 5, 66};
//        for (int i = 0; i< array.length; i++)
//            System.out.println(array[i]);
//        System.out.println("=====================================");
//
//        for (int x : array)
//            System.out.println(x);
//        int i = 10;
//        while (i < 10){
//            i++;
//            if (i == 5)
//                continue;
//            System.out.println(i);
//        }
        int i = 10;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);

        System.out.println("End of the program");
    }
}
