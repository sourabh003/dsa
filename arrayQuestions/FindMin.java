public class FindMin {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 5, 7 };
        int n = arr.length;
        System.out.println(findMin(arr, n));
    }

    public static int findMin(int[] arr, int n) {
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
