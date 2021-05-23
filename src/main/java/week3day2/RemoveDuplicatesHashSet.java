package week3day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesHashSet {
    public static void main(String[] args) {
        String input = "PayPal India";
        char[] charInput = input.toCharArray();
        Set<Character> removeDuplicates = new HashSet<Character>();// Don't allow duplicates and un ordered
        for (Character removeDup:charInput) {
            if (removeDup!=' ') {
                removeDuplicates.add(removeDup);
            }
        }
        System.out.println(removeDuplicates);
    }
}
