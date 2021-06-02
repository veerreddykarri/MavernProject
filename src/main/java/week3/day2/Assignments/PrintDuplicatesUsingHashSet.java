package week3.day2.Assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesUsingHashSet {
    public static void main(String[] args) {
        int[] data = {1, 3, 8, 3, 11, 5, 6, 4, 7, 6, 7};
        Set<Integer> removeDuplicates = new HashSet<Integer>();
        for (Integer addData : data) {
            if (!removeDuplicates.add(addData)) {
                System.out.println("Duplicate element in array is : " + addData);
            }
        }
    }
}
