package week1.day2.assignments;

public class SumOfDigitsFromString {
    public static void main(String[] args) {
        String text = "Tes12Le79af65";
        int sum = 0;
        String numberFilter = text.replaceAll("[a-zA-Z]","");
        System.out.println(numberFilter);
        char[] stringToArray = numberFilter.toCharArray();
        for(int i=0;i<=stringToArray.length-1;i++){
            int deriveNumberFromChar = Character.getNumericValue(stringToArray[i]);
            sum = sum + deriveNumberFromChar;
        }
        System.out.println(sum);
    }
}
