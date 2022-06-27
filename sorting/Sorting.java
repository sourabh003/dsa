import utils.Utils;

public class Sorting {
    public static void main(String[] args) {
        int[] inputArray = { 1, 5, 3, 2, 8, 43, 88, 0 };
        int[] resultArray = insertionSort(inputArray, inputArray.length);
        Utils.printArray(resultArray);
    }

    // Bubble Sort - Time Complexity => O(n^2)
    public static int[] bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) { // loop will run based on => n
            for (int j = 0; j < n - i - 1; j++) { // loop will run based on => n
                if (arr[j] > arr[j + 1]) {
                    // swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    // Selection Sort - Time Complexity - 0(n^2)
    public static int[] selectionSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int samllestIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[samllestIndex] > arr[j]) {
                    samllestIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[samllestIndex];
            arr[samllestIndex] = temp;
        }
        return arr;
    }

    // Insertion Sort - Time Complexity - 0(n^2)
    public static int[] insertionSort(int[] arr, int n) {
        // looping the unsorted array
        for (int i = 1; i < n; i++) {
            int current = arr[i];

            int j = i - 1;
            // looping the sorted array
            while (j >= 0 && current < arr[j]) {
                // pushing elements to make space
                arr[j + 1] = arr[j];
                j--;
            }
            // placing the smallest element
            arr[j + 1] = current;
        }
        return arr;
    }

}