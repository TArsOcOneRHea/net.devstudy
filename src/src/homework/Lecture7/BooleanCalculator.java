package homework.Lecture7;
import java.util.Scanner;

public class BooleanCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a:");
        int a = scanner.nextInt();
        System.out.println("Please input b:");
        int b = scanner.nextInt();
        System.out.println("--------------------------------------------");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a = b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > 0 or b > 0 " + ((a > 0) || (b > 0)));
        System.out.println("a > 0 and not b > 0 " + ((a > 0) != (b > 0)));

    }
}
