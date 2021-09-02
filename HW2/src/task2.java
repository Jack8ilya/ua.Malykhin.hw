public class task2 {
    public static void main(String[] args) {
        int ax = 8;
        int ay = 5;
        int bx = 8;
        int by = -8;
        int cx = -5;
        int cy = -8;
        double b = Math.abs((ax-cx)*(bx-cx)-(ay-cy)*(by-cy))*0.5;
        System.out.println(b);
    }
}
