import java.io.Console;

public class QuickSort {
    public static void main(String[] args) {
        final int[] arr = { 68, 69, 93, 62, 52, 64, 22, 72, 71, 44, 33, 20, 76, 21, 92, 85, 48, 80, 50, 84, 6,
                35, 32, 25, 54,
                3, 59, 77, 26, 89 };
        quickSort(arr, 0, arr.length - 1);
        // printArray(arr);
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
                swap(arr, i, j);
            }
        }
        swap(arr, j, low);
        return j;
    }

    public static void swap(int[] arr, int index1, int index2) {
        printSwappedArray(arr, index1, index2, true);
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        printSwappedArray(arr, index1, index2, false);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void printSwappedArray(int[] arr, int elem1, int elem2, boolean before) {
        for (int i = 0; i < arr.length; i++) {
            if (i == elem1) {
                System.out.print("\033[42m" + arr[i] + "\033[0m ");
            } else if (i == elem2) {
                System.out.print("\033[43m" + arr[i] + "\033[0m ");
            } else {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("");
    }
}
