package Homework.Lecture8;

import java.util.Scanner;

public class ComplexCalculator {
    public static void main(String[] args) {
        System.out.println("Please input a:");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Please input b:");
        int b = new Scanner(System.in).nextInt();
        System.out.println("Please input operator: {+,-,*,/,%,^,!,v,2,3}");
        char ch = new Scanner(System.in).nextLine().charAt(0);
        if (ch == '+') {
            System.out.println("a + b = " + (a + b));
        } else if (ch == '-') {
            System.out.println("a - b = " + (a - b));
        } else if (ch == '*') {
            System.out.println("a * b = " + (a * b));
        } else if (ch == '/') {
            System.out.println("a / b = " + (a / b));
        } else if (ch == '%') {
            System.out.println("a % b = " + (a % b));
        } else if (ch == '^') {
            System.out.println("a ^ b = " + Math.pow(a, b));
        } else if (ch == '!') {

            if (a >= 0 && a <= 25) {
                long res = 1;
                for (int i = 1; i <= a; i++) {
                    res *= i;
                }
                System.out.println("a! = " + res);
            } else {
                System.out.println("Invalid argument for factorial : " + a);
            }
        } else if (ch == 'v') {
            if (a >= 0) {
                System.out.println("sqrt(a)=" + Math.sqrt(a));
            } else {
                System.out.println("Invalid argument for sqrt : " + a);
            }
        } else if (ch == '2') {
            System.out.println("a^2=" + (a * a));
        } else if (ch == '3') {
            System.out.println("a^3=" + (a * a * a));
        } else {
            System.out.println("Unsupported operator: " + ch);
        }
    }
}
