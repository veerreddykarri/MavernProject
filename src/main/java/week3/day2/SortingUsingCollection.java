package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {
    public static void main(String[] args) {
        String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
        List<String> inputSort = new ArrayList<String>();
        for (String addInputValuesToList: input) {
            inputSort.add(addInputValuesToList);
        }
        System.out.println(inputSort);
        Collections.sort(inputSort);
        System.out.println(inputSort);
        for (int i= inputSort.size()-1;i>=0;i--){
            System.out.print(inputSort.get(i)+" ,");
        }
    }
}
