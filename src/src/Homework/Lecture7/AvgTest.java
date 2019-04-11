package Homework.Lecture7;

import java.util.Scanner;

public class AvgTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a:");
        int a = scanner.nextInt();
        System.out.println("Please input b:");
        int b = scanner.nextInt();
        System.out.println("--------------------------------------------");
        System.out.println("Avg = " + ((a + b) / 2));
    }
}
