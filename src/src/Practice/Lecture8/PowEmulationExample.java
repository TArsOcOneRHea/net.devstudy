package Practice.Lecture8;

public class PowEmulationExample {
    public static void main(String[] args) {
        int a = -5;
        int b = 2;
        if(b >= 0) {
            int result = 1;
            for (int i = 0; i < b; i++) {
                result *= Math.abs(a);
            } if (a < 0 && b % 2 == 1) {
                result = -result;
            }
            System.out.println(result);
        } else {
            System.out.println("Invalid b");
        }
    }
}
