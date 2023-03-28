package javaCode;

public class MethodOverloadExample {
    public static void main(int num1, int num2) {
        System.out.println("method 1 called");
    }

    public static void main(String str) {
        System.out.println(" method 2 called");
    }

    public  void main(String args[]) {

        System.out.println("Original main() method called");

    }
}



