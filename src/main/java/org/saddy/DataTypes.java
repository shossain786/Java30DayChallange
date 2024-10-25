package org.saddy;

public class DataTypes {
    int age =20;                //instance variable
    String name = "Java";
    static int num = 30;        // static variable

    int number;     //instance variable

    public void display(){
        int count = 20;         // local variable
        System.out.println(age);
        System.out.println(count);
    }

    public void print(Integer age){
        System.out.println(age);
//        System.out.println(count);
    }

    public static void main(String[] args) {
        int number2;        //local variable
        DataTypes obj = new DataTypes();
        int personeAge = 50;
        long perAge = 100l;
        obj.print(personeAge);
        obj.print((int) perAge);




//        System.out.println(obj.number);
////        System.out.println(number2);
//
//        byte age = 100;
//        byte age1 = 127;
////        byte age2 = 128; //out of range of byte
//        byte age3 = -128;
//        short x = 100;
//        short y = -32768;
//        byte a2 = (byte) x;
//
//        int a1 = age;
//        System.out.println("a1:" + a1);
//        System.out.println("a2:" + a2);
//        System.out.println("x:" + x);

    }
}

// instance and static variables should be always outside of a method and inside of a class