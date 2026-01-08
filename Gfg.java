public class Gfg {
    public static int missingNum(int arr[]) {
        for (int i = 1; i <= arr.length; i++) {
            boolean isFound = false;
            for (int j = 0; j < arr.length; j++) {
                if (i == arr[j]) {
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                return i;
            }
        }
        return -1;  
    }

    public static void main(String[] args) {
        int[] arr = { 8, 2, 4, 5, 3, 7, 1 };
        System.out.println(missingNum(arr));
    }
}