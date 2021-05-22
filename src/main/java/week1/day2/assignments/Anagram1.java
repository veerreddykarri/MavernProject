package week1.day2.assignments;

import java.util.Arrays;

public class Anagram1 {
    public static void main(String[] args) {
        Anagram1 obj = new Anagram1();
        System.out.println(obj.anagram("silent", "listen"));
        if (obj.anagram("silent", "listen")) {
            System.out.println("Anagram");
        } else
            System.out.println("Not an Anagram");
    }

    public boolean anagram(String str1, String str2) {
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean res = Arrays.equals(ch1, ch2);
        return res;
    }
}
