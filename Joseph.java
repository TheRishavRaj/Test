import java.util.ArrayList;

public class Joseph {
    public static int toBinary(int n) {
        ArrayList<Integer> bin = new ArrayList<>();
        while (n > 0) {
            int r = n % 2;
            bin.addFirst(r);
            n /= 2;
        }
        System.out.println(bin);
        int result = 0;
        int i = bin.size() - 1;
        for (Integer in : bin) {
            int d;
            if (in == 0) {
                d = 1;
            } else {
                d = 0;
            }
            result += Math.pow(2, i) * d;
            System.out.println(result);
            i--;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 10;
        int bin = toBinary(n);
        System.out.println(bin);
    }
}
