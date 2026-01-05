import java.util.Arrays;

public class RecursiveBubbleSort {

    /**
     * Recursively sorts the array using Bubble Sort.
     * @param arr The array to be sorted.
     * @param n   The number of elements to consider in the current pass.
     */
    public static void bubbleSort(int[] arr, int n) {
        // Base case: if array size is 1, it's already sorted
        if (n <= 1) {
            return;
        }

        // One pass of bubble sort. After this pass, 
        // the largest element among the first 'n' elements 
        // is moved (or bubbled) to the end (index n-1).
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // Swap arr[i] and arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // The largest element is now in its correct place.
        // Recur for the remaining (n-1) elements.
        bubbleSort(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] data = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array: " + Arrays.toString(data));

        // Call recursive function with the full array length
        bubbleSort(data, data.length);

        System.out.println("Sorted Array:   " + Arrays.toString(data));
    }
}
