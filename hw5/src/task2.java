import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        int[] array = {9, 7, 3, 2, 2};
        System.out.println(Arrays.toString(array));
        System.out.println(isOrderedArray(array));
    }

    public static boolean isOrderedArray(int[] array) {
        boolean ordered = false;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                ordered = true;
            } else {
                ordered = false;
                return ordered;
            }
        }
        return ordered;
    }
}
