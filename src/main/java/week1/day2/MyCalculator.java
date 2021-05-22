package week1.day2;

public class MyCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1,2,3));;
        System.out.println(calculator.sub(4,2));
        System.out.println(calculator.mul(20,20));
        System.out.println(calculator.divide(25,2));
    }
}
