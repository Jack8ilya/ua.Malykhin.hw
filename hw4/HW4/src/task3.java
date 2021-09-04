import java.util.concurrent.ThreadLocalRandom;

public class task3 {
    public static void main(String[] args) {
        int[] array = new int[1000];
        fillArray(array);
        System.out.println("Простых чисел в массиве = " + simplCounter(array));
        System.out.println("Составных чисел в массиве = " + sosCounter(array));
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt();
        }
    }

    public static boolean simpl(int number) {
        boolean Bnumber = number > 1;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number <= 1 || number % 2 == 0 || number % 3 == 0 || number % i == 0) {
                Bnumber = false;
                break;
            }
        }
        return Bnumber;
    }

    public static int simplCounter(int[] array) {
        int count = 0;
        for (int i : array) {
            if (simpl(i)) {
                count++;
            }
        }
        return count;
    }
    public static int sosCounter(int[] array) {
        int count = 0;
        for (int i : array) {
            if (i > 1 && !simpl(i)) {
                count++;
            }
        }
        return count;
    }
}
