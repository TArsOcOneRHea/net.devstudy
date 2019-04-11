package Practice.Lecture8;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.println("Please input a:");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Please input b:");
        int b = new Scanner(System.in).nextInt();
        System.out.println("Please input operator: {+,-,*,/}");
        char ch = new Scanner(System.in).nextLine().charAt(0);
        if (ch == '+') {
            System.out.println("a + b = " + (a + b));
        } else if (ch == '-') {
            System.out.println("a - b = " + (a - b));
        } else if (ch == '*') {
            System.out.println("a * b = " + (a * b));
        } else if (ch == '/') {
            System.out.println("a / b = " + (a / b));
        } else {
            System.out.println("Unsupported operator: " + ch);
        }
    }
}