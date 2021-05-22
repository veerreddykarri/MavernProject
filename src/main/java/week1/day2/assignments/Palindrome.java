package week1.day2.assignments;

public class Palindrome {
    public static void main(String[] args) {
        String word = "madam";
        String lowerWord = word.toLowerCase();
        String reverseWord = "";
        for (int i=lowerWord.length()-1;i>=0;i--){
            reverseWord = reverseWord + lowerWord.charAt(i);
        }
        System.out.println(reverseWord);
        if(word.contentEquals(reverseWord)){
            System.out.println("The word is a Palindrome");
        }
        else
            System.out.println("The word is not a Palindrome");

    }
}
