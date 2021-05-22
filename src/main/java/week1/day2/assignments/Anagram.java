package week1.day2.assignments;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String text1 = "dusty";
        String text2 = "study";
        if (text1.length() == text2.length()) {
            char[] convertText1ToChar = text1.toCharArray();
            System.out.println(convertText1ToChar);
            char[] convertText2ToChar = text2.toCharArray();
            System.out.println(convertText2ToChar);
            Arrays.sort(convertText1ToChar);
            Arrays.sort(convertText2ToChar);
            int count = 1;
            for (int i = 0; i < text1.length() - 1; i++) {
                if (convertText1ToChar[i] == convertText2ToChar[i]) {
                    count++;
                }
            }
            if (count == text1.length()) {
                System.out.println("The Word is a Anagram");
            } else
                System.out.println("The Word is NOT a Anagram");
        }
    }
}
