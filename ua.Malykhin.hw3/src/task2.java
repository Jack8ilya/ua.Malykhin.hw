import java.util.Locale;
import java.util.Scanner;

class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите слово: ");
        String text = scan.nextLine();
        String s1 = text.toUpperCase().replaceAll("[^A-Za-z]", "");
        StringBuffer s2 = new StringBuffer(s1).reverse();
        System.out.println(s1);
        System.out.println(":y words");
        System.out.println(s2);
        System.out.println(":палиндром");
    }
}

