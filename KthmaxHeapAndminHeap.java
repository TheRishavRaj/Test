import java.util.PriorityQueue;
import java.util.Collections;

public class KthmaxHeapAndminHeap {
    static void kmaxHeapAndminHeap(int[] arr, int k) {
        // if (k > arr.length) {
        // System.out.println("Not possible!");
        // }
        // Arrays.sort(arr);
        // System.out.println(k + " maxHeap element is : " + arr[k - 1]);
        // System.out.println(k + " minHeap element is : " + arr[arr.length - k]);


        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) {
            maxHeap.add(num);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        System.out.println(maxHeap.peek());

        System.out.println(minHeap.peek());
    }

    public static void main(String[] args) {
        int arr[] = { 6, 5, 7, 4, 8, 3, 9, 2, 0, 1 };
        int k = 4;
        kmaxHeapAndminHeap(arr, k);
    }
}
