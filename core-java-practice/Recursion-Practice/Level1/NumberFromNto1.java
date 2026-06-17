package RecursionPractice.Level1;

public class NumberFromNto1 {

    static void printNto1(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");
        printNto1(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        printNto1(n);
    }
}