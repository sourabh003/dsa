import utils.Utils;

public class QuickSort {
    public static void main(String[] args) {
        final int[] arr = { 68, 69, 93, 62, 52, 64, 22, 72, 71, 44, 33, 20, 76, 21, 92, 85, 48, 80, 50, 84, 6,
                35, 32, 25, 54,
                3, 59, 77, 26, 89 };
        long start = System.currentTimeMillis();
        quickSort(arr, 0, arr.length - 1);
        long end = System.currentTimeMillis();
        System.out.println("Time taken => " + (end - start));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            while (arr[j] > pivot && j >= low) {
                j--;
            }
            if (i < j) {
                Utils.swap(arr, i, j);
            }
        }
        Utils.swap(arr, j, low);
        return j;
    }
}
