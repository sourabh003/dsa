import utils.Utils;

public class Sort012 {
    public static void main(String[] args) {
        int[] a = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int n = a.length;
        sort(a, n);
        Utils.printArray(a);
    }

    /*
     * DUTCH NATIONAL FLAG ALGORITHM
     * 
     * There will be 3 pointers and 3 rules
     * Pointers - low = 0; mid = 0; high = n - 1
     * 
     * 3 Rules -
     * (0 to low will be 0s)
     * (low to mid - 1 will be 1s )
     * (high + 1 to n will be 2s )
     */

    public static void sort(int[] arr, int n) {
        int low = 0, mid = 0, high = n - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                Utils.swap(arr, mid, low);
                mid++;
                low++;
                continue;
            }
            if (arr[mid] == 1) {
                mid++;
                continue;
            }
            if (arr[mid] == 2) {
                Utils.swap(arr, mid, high);
                high--;
                continue;
            }
        }
    }
}
