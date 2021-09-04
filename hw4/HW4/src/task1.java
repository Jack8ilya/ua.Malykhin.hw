import java.util.concurrent.ThreadLocalRandom;

public class task1 {
    public static void main(String[] args) {
        int[] array = new int[400];
        fillArray(array);
        System.out.println("Среднее арифметическое массива = " + arithmetic(array));
        System.out.println("Среднее геометрическое массива = " + cerGeometrik(array));
    }
    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt();
        }
    }

    public static double cerGeometrik(int[] array) {
        double mul = 1;
        for (int i : array) {
            mul *= i;
        }
        return Math.round(1000000.0 * Math.pow(mul, 1.0 / array.length)) / 1000000.0;
    }

    public static double arithmetic(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return Math.round(1000000.0 * sum / array.length) / 1000000.0;
    }


}
