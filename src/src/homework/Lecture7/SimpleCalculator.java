package homework.Lecture7;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a:");
        int a = scanner.nextInt();
        System.out.println("Please input b:");
        int b = scanner.nextInt();
        System.out.println("--------------------------------------------");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("a + b: " + (a + b));
        System.out.println("a - b: " + (a - b));
        System.out.println("a * b: " + (a * b));
        System.out.println("a / b: " + (a / b));
        System.out.println("a ./ b: " + ((double) a / b));
        System.out.println("a % b: " + (a % b));
        System.out.println("a ^ b: " + Math.pow(a, b));
        if (a > b){
            System.out.println("min " + b);
        } else {
            System.out.println("min " + a);
        }

        if (a < b){
            System.out.println("max: " + b);
        } else {
            System.out.println("max: " + a);
        }


    }
}
