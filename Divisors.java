import java.util.ArrayList;

public class Divisors {
    static ArrayList<Integer> findDivisors(int num) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) {
                arr.add(i);
            }
        }
        arr.add(num);
        return arr;
    }

    public static void main(String[] args) {
        int num = 12;
        System.out.println(findDivisors(num));
    }
}
