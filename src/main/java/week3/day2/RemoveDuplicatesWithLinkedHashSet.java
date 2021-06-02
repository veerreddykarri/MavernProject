package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWithLinkedHashSet {
    public static void main(String[] args) {
        String input = "PayPal India";
        char[] charInput = input.toCharArray();
        Set<Character> removeDuplicates = new LinkedHashSet<Character>();//Orders elements based on insertion order
        for (Character removeDup:charInput) {
            if (removeDup!=' ') {
                removeDuplicates.add(removeDup);
            }
        }
        System.out.println(removeDuplicates);
    }
}
