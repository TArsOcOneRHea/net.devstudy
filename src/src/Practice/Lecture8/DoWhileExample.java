package Practice.Lecture8;

public class DoWhileExample {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(++i);
        }
        i = 0;
        do {
            System.out.println(++i);
        } while (i < 10);
    }
}
