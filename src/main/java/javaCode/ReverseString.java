package javaCode;

public class ReverseString {

    public static void main(String[] args) {
        String r = reverse("Ankur kumar Pandey!!");
        System.out.println(r);
    }

    public static String reverse(String s) {
        char[] letter = new char[s.length()];
        int letterIndex = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            letter[letterIndex] = s.charAt(i);
            letterIndex++;
            System.out.println(letterIndex);
        }
        String reverse = "";
        for (int i = 0; i < s.length(); i++) {
            reverse = reverse + letter[i];
        }
        return reverse;

    }
}
