package Practice.Lecture8;

public class ArithmeticProgression {
    public static void main(String[] args) {
        int a = 2;
        int d = 4;
        int n = 10;
        System.out.print(a + " ");
        for (int i = 1; i < n; i++) {
            System.out.print((a += d) + " ");
        }
    }
}
