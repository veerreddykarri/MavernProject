package week3.day2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesTreeSet {
    public static void main(String[] args) {
        String input = "PayPal India";
        char[] charInput = input.toCharArray();
        Set<Character> removeDuplicates = new TreeSet<Character>();//Sorts in ASCII order
        for (Character removeDup:charInput) {
            if (removeDup!=' ') {
                removeDuplicates.add(removeDup);
            }
        }
        System.out.println(removeDuplicates);
        System.out.println(removeDuplicates.size());
    }
}
