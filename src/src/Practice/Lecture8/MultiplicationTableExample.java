package Practice.Lecture8;

public class MultiplicationTableExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------");
        int i = 1;
        while(i <= 9) {
            int j = 1;
            while (j <= 9) {
                System.out.println(i + " * " + j + " = " + (i * j));
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
