import java.util.Arrays;

public class PalindromeString {
    static boolean isPalindrome(String str) {
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - 1 - i] = ch;
        }
        return (new String(arr)).equals(str);
    }

    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPalindrome(str));
    }
}
