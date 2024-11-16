package org.saddy;

public class StringBuilderBuffer {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Java");
        StringBuffer stringBuffer = new StringBuffer("Java");

//        System.out.println(stringBuilder);
//        System.out.println(stringBuffer);
        stringBuilder.append(" Program");

        System.out.println(stringBuilder);

//        System.out.println(stringBuilder.delete(5,8));
        System.out.println(stringBuilder.insert(5, "Core "));
        System.out.println(stringBuilder.reverse());
    }
}
// insert, delete, reverse