package javaCode;

public class RepeatedNumber {
    public static void main(String[] args) {

        System.out.println(number(7));
    }
    public static int number(int R) {
        int num = 898878798, count = 0;

        while (num > 0) {
            int rem = num % 10;
            if (rem == R) {
                count++;
            }
            num /= 10;
        }
        return count;
    }
}
