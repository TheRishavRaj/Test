import java.util.ArrayList;
import java.util.Arrays;

public class duplicate {
    // without extra space
    static int findDuplicate(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    static int[] removeDuplicate(int[] arr) {
        ArrayList<Integer> arr2 = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            if (!arr2.contains(arr[i])) {
                arr2.add(arr[i]);
            }
        }
        return arr2.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int arr[] = { 0, 6, 5, 5, 5, 7, 4, 8, 3, 9, 2, 0, 1 };
        int val = findDuplicate(arr);
        if (val != -1) {
            System.out.println(val);
        } else {
            System.out.println("Duplicate Value not found");
        }
        int arr2[] = removeDuplicate(arr);
        System.out.println(Arrays.toString(arr2));
    }
}
