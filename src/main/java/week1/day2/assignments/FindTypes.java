package week1.day2.assignments;

public class FindTypes {
    public static void main(String[] args) {
        String test = "$$ Welcome to 2nd Class of Automation $$ ";
        int letter = 0, space = 0, num = 0, specialChar = 0;
        char[] convertStringToCharArray = test.toCharArray();
        for (int i = 0; i < convertStringToCharArray.length; i++) {
            if (Character.isLetter(convertStringToCharArray[i])) {
                letter++;
            } else if (Character.isDigit(convertStringToCharArray[i])) {
                num++;
            } else if (Character.isSpaceChar(convertStringToCharArray[i])) {
                space++;
            } else
                specialChar++;
        }

        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + num);
        System.out.println("special Character: " + specialChar);
    }
}
