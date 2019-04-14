package Practice.Lecture9;

public class SetAndGetElement {
    public static void main(String[] args) {
        int array[] = {1, -4, -4, 0, 4, 2, 8, -5, 7, -2, 9, 10};
        System.out.println(array[2]);
        array[2] = 9;
        System.out.println(array[2]);
        System.out.println("Array length: " + array.length);
        System.out.println(array[array.length - 1]);
//        System.out.println(array[78]);
    }
}
