package week1.day1.assignments;

public class SumOfNumbers {
    public static void main(String[] args) {
        int input = 155;
        int calculatedValue = 0;

        while(input>0){
            int remainder = input % 10;
            input = input / 10;
            calculatedValue = calculatedValue + remainder;
        }
        System.out.println(calculatedValue);
    }
}
