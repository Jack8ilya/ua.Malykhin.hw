import java.util.concurrent.ThreadLocalRandom;

public class task2 {
    public static void main(String[] args) {
        int[] array = new int[1000];
        fillArray(array);
        System.out.println("Простых чисел в массиве = " + primeCounter(array));
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt();
        }
    }

    public static boolean Prime(int number) {
        boolean Bnumber = number > 1;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number <= 1 || number % 2 == 0 || number % 3 == 0 || number % i == 0) {
                Bnumber = false;
                break;
            }
        }
        return Bnumber;
    }

    public static int primeCounter(int[] array) {
        int count = 0;
        for (int i : array) {
            if (Prime(i)) {
                count++;
            }
        }
        return count;
    }
}
