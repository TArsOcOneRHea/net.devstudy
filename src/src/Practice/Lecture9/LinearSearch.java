package Practice.Lecture9;

public class LinearSearch {
    public static void main(String[] args) {
        int array[] = new int[1024];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        int query = 5000;
        int index = -1;
        int iterationCount = 0;
        for (int i = 0; i < array.length; i++) {
            iterationCount++;
            if (array[i] == query) {
                index = i;
                break;
            }
        }
        System.out.println("Index of " + query + ": " + index);
        System.out.println("iterationCount=" + iterationCount);
    }
}
