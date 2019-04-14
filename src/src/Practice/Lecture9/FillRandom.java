package Practice.Lecture9;

import java.util.Arrays;
import java.util.Random;

public class FillRandom {
    public static void main(String[] args) {
        int array[] = new int[10];
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = new Random().nextInt(10) + 1;
        }
        System.out.println(Arrays.toString(array));
    }
}
