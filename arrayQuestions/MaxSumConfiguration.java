import utils.Utils;

public class MaxSumConfiguration {
    public static void main(String[] args) {
        int[] arr = { 8, 3, 1, 2 };
        int n = arr.length;
        System.out.println(maxSumConfiguration(arr, n));
    }

    public static int maxSumConfiguration(int[] arr, int n) {
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            int currSum = rotateAndCalculate(arr, n);
            if (currSum > maxSum) {
                maxSum = currSum;
            }
        }
        return maxSum;
    }

    public static int rotateAndCalculate(int[] arr, int n) {
        // Rotating
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;

        // Calculating
        int currSum = 0 * arr[0];
        for (int i = 0; i < n; i++) {
            currSum = currSum + (i * arr[i]);
        }
        return currSum;
    }
}
