public class SegregateArray {
    public static void main(String[] args) {
        int arr[] = { 1, -1, 3, 2, -7, -5, 11, 6 };
        int n = arr.length;

        printArray(arr);
        segregate(arr, n);
    }

    public static void segregate(int[] arr, int n) {
        int i = 0;
        while (i < n) {
            if (arr[i] < 0) {
                int num = arr[i];
                for (int j = i + 1; j < n; j++) {
                    arr[j - 1] = arr[j];
                }
                arr[n - 1] = num;
            }
        }
        printArray(arr);

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
