package homework.Lecture7;

import java.util.Scanner;

public class ExtendedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a:");
        int a = scanner.nextInt();
        System.out.println("Please input b:");
        int b = scanner.nextInt();
        System.out.println("a++ " + (++a));
        System.out.println("b-- " + (--b));
        System.out.println("a>>1 = " + (a>>1));
        System.out.println("a/2 = " + (a / 2));
        System.out.println("a<<1 = " + (a<<1));
        System.out.println("a*2 = " + (a * 2));
    }
}
