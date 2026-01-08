package sorting.mergeSort;

import java.util.Arrays;

public class MergeSort {
    public MergeSort(int arr[], int l, int r) {
        mergeSort(arr, l, r);
    }

    public void merge(int[] arr, int l, int m, int r) {
        int l1 = m - l + 1;
        int l2 = r - m;

        int left[] = new int[l1];
        int right[] = new int[l2];

        for (int i = 0; i < l1; i++) {
            left[i] = arr[l + i];
        }
        for (int j = 0; j < l2; j++) {
            right[j] = arr[m + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = l;
        while (i < l1 && j < l2) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < l1) {
            arr[k++] = left[i++];
        }
        while (j < l2) {
            arr[k++] = right[j++];
        }

    }

    public void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 5, 7, 4, 8, 3, 9, 2, 0, 1 };
        int n = 10;
        System.out.println(Arrays.toString(arr));
        new MergeSort(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }
}
