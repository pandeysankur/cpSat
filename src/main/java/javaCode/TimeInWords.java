package javaCode;

public class TimeInWords {
    public static void main(String[] args) {
        int h = 1;
        int m = 55;

        String word[] = {
                "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty one", "twenty two",
                "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine"
        };
        String time = "";

        if (m == 0) {
            time = word[h] + " o' clock";
        } else if (m == 15) {
            time = "quarter past " + word[h];
        } else if (m == 30) {
            time = "half past " + word[h];
        } else if (m == 45) {
            time = "quarter to " + word[h + 1];
        } else if (m == 1) {
            time = word[m] + " minute past " + word[h];
        } else if (m < 30) {
            time = word[m] + " minutes past " + word[h];
        } else {
            time = word[60 - m] + " minutes to " + word[h + 1];
        }
        System.out.println(time);
    }


}


