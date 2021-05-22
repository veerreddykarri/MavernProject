package week1.day1.assignments;
// 0 1 2 3 5 8
public class FibonacciSeries {
    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 1;
        int sum = 0;
        int range = 8;
        System.out.print(firstNumber+" "+secondNumber);
        for (int i= 1; i<range;i++){
            sum = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sum;
            System.out.print(" " +secondNumber);
        }
    }
}
