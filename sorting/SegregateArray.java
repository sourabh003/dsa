import utils.Utils;

public class SegregateArray {
    public static void main(String[] args) {
        int arr[] = { 1, -1, 3, 2, -7, -5, 11, 6 };
        int n = arr.length;

        Utils.printArray(arr);
        segregate(arr, n);
        Utils.printArray(arr);
    }

    /*
     * Segregate array
     * 
     * Time complexity - O(n) // Commonly used approach
     * 
     */
    public static void segregate(int[] arr, int n) {
        int[] tempArray = new int[n];
        int tempArrayIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                tempArray[tempArrayIndex++] = arr[i];
            }
        }

        if (tempArrayIndex == n || tempArrayIndex == 0) {
            return;
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                tempArray[tempArrayIndex++] = arr[i];
            }
        }

        for (int x = 0; x < n; x++) {
            arr[x] = tempArray[x];
        }
    }

}
