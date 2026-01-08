public class FibonacciSeries {
    static void fibonacciSeries(int a, int b, int n) {
        if (n > 0) {
            System.out.print(a + "\t    ");
            fibonacciSeries(b, a + b, n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        fibonacciSeries(0, 1, n);
    }
}
