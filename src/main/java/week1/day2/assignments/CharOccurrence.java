package week1.day2.assignments;

public class CharOccurrence {
    public static void main(String[] args) {
        String str = "welcome to chennai";
        int count = 0;
        char[] convertStringToCharArray = str.toCharArray();
        for (int i = 0; i < convertStringToCharArray.length - 1; i++) {
            if (convertStringToCharArray[i] == 'e') {
                count++;
            }
        }
        System.out.println("The Count for Character 'e' is : " + count);

    }
}
