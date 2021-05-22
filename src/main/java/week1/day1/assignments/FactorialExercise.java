package week1.day1.assignments;

public class FactorialExercise {
    public static void main(String[] args) {
        int number = 8;
        int factorial = 1;
        for(int i=number;i>=1;i--){
            factorial = factorial * i;
        }
        System.out.println("The factorial of "+number+" is "+factorial);
    }
}
