import java.util.Scanner;

public class TreeBeautyProblem {
    public static Boolean isPerfectSquare(long n) {
        if (n < 0)
            return false;

        long r = (long) Math.sqrt(n);
        return n == r * r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int par[] = new int[n];
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            dfs
        }

        sc.close();
    }
}
