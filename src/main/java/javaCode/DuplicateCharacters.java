package javaCode;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String sentence="How many duplicate are there!";
        String characate="";
        String duplicate="";

        for (int i=0;i<sentence.length();i++){
            String current=Character.toString(sentence.charAt(i));
            if (characate.contains(current)){
                if (!duplicate.contains(current)){
                    duplicate+=current+",";
                }
            }
            characate+=current;
        }
        System.out.println(duplicate);
    }
}
