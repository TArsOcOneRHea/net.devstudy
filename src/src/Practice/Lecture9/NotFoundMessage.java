package Practice.Lecture9;

public class NotFoundMessage {
    public static void main(String[] args) {
        int array[] = {1, -4, -4, 0, 4, 2, 8, -5, 7, -2, 9, 0, -50};
        int element = -50;
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
    }
}
