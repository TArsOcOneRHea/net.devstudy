package homework.Lecture7;

import java.util.Scanner;

public class SimpleSwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a:");
        int a = scanner.nextInt();
        System.out.println("Please input b:");
        int b = scanner.nextInt();
        System.out.println("a - " + a);
        System.out.println("b - " + b);
        int sum = a + b;
        a = sum - a;
        b = sum - a;
        System.out.println("a - " + a);
        System.out.println("b - " + b);
    }
}
