package week3day2.Assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesUsingArrayList {
    public static void main(String[] args) {
        int[] data = {1, 3, 8, 3, 11, 5, 6, 4, 7, 6, 7};
        List<Integer> removeDuplicates = new ArrayList<Integer>();
        for (Integer addData:data) {
            removeDuplicates.add(addData);
        }
        for (int i = 0; i < removeDuplicates.size(); i++) {
            for (int j = i + 1; j < removeDuplicates.size(); j++) {
                if (removeDuplicates.get(i) == removeDuplicates.get(j))
                    System.out.println(removeDuplicates.get(i));
            }
        }
    }
}