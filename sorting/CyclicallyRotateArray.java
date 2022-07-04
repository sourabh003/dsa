import utils.Utils;

public class CyclicallyRotateArray {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        Utils.printArray(arr);
        rotate(arr, n);
        Utils.printArray(arr);
    }

    /*
     * Time Complexity - O(n)
     */

    public static void rotate(int[] arr, int n) {
        int lastElem = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastElem;
    }
}
