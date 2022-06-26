public class Sort012 {
    public static void main(String[] args) {
        int[] a = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int n = a.length;
        sort(a, n);
        printArray(a);
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
                swap(arr, mid, low);
                mid++;
                low++;
                continue;
            }
            if (arr[mid] == 1) {
                mid++;
                continue;
            }
            if (arr[mid] == 2) {
                swap(arr, mid, high);
                high--;
                continue;
            }
        }
    }

    public static void swap(int[] arr, int index1, int index2) {
        printSwappedArray(arr, index1, index2);
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        printSwappedArray(arr, index1, index2);
    }

    public static void printSwappedArray(int[] arr, int elem1, int elem2) {
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

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
