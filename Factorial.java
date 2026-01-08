public class Factorial {
    static long factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        int num = -5;
        System.out.println(factorial(num));
    }
}
