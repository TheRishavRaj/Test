import java.util.Arrays;
import sorting.mergeSort.MergeSort;

public class BinarySearch {
    static int binarySearch(int[] arr, int key) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] > key) {
                r = mid - 1;
            } else if (arr[mid] < key) {
                l = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 5, 7, 4, 8, 3, 9, 2, 0, 1 };
        int n = 10;
        new MergeSort(arr, 0, n - 1);

        int key = 8;
        int in;
        if ((in = binarySearch(arr, key)) != -1) {
            System.out.println(key + " is found at index " + in);
        } else {
            System.out.println("Not Found");
        }
    }
}
