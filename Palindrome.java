public class Palindrome {
    static boolean isPalindrome(int num) {
        int tmp = num;
        int rev = 0;
        if (num < 0) {
            return false;
        }
        while (tmp != 0) {
            int r = tmp % 10;
            rev = rev * 10 + r;
            tmp /= 10;
        }

        return (num == rev);
    }

    public static void main(String[] args) {
        int num = 12321;
        if (isPalindrome(num)) {
            System.out.println("Palindrome Number.");
        } else {
            System.out.println("Not a Palindrome Number.");
        }
    }
}
