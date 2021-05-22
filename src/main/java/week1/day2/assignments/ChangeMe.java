package week1.day2.assignments;

public class ChangeMe {
    public static void main(String[] args) {
        String test = "changeme";
        System.out.println(test.toCharArray());
        char[] characters = test.toCharArray();
        for (int i = 0; i <= characters.length - 1; i++) {
            while (i % 2 > 0) {
                characters[i] = Character.toUpperCase(characters[i]);
                break;
            }
        }
        System.out.println(characters);
    }
}
