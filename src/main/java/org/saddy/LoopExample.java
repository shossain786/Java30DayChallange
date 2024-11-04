package org.saddy;

public class LoopExample {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i<10);

//        outerLoop:
//        for (int i = 0; i <= 10 ; i++){
//            for (int j =10; i < j; j--){
//                if (j == 5)
//                    continue outerLoop;
////                    break outerLoop;
//                System.out.println(i + " -> " + j);
//            }
//        }
        System.out.println("Loop completed");

//        for (int i =0; ; i++){
//            if (i == 6)
//                continue;
//            if (i==10)
//                break;
//            System.out.println(i);
//        }
        //loop
//        for (int i= 0; i<10; i++){
//            System.out.print(i);
//        }

//        int i = 0;
//        while (i<10){
//            System.out.println(i);
//            i++;
//        }
    }
}
