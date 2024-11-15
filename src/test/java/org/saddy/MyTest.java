package org.saddy;

public class MyTest {
    public static void main(String[] args) {
        String str = "Java Programming";
        int vowels = 0, consonants = 0;
        for (char ch : str.toLowerCase().toCharArray()){
            if ("aeiou".indexOf(ch) != -1)
                vowels ++;
            else if (Character.isLetter(ch))
                consonants ++;
        }
        System.out.println("Vowels: " + vowels + " Consonants: " + consonants);
    }
}
