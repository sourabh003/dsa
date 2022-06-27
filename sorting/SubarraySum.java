import java.util.ArrayList;

/*
 * Subarray with given sum
 * 
 */

public class SubarraySum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 7, 5 };
        int n = arr.length;
        sum(arr, n, 8);
    }

    // Bruteforce approach - Time complexity -> O(n^2)
    public static ArrayList<Integer> sum(int[] arr, int n, int s) {
        ArrayList<Integer> output = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int sum = 0;
            int j = i;
            output.clear();
            output.add(j + 1);
            while (sum < s && j < n) {
                sum = sum + arr[j];
                j++;
            }
            if (sum == s) {
                output.add(j + 1);
                break;
            }
        }
        if (output.size() == 1) {
            output.clear();
            output.add(-1);
            return output;
        }
        return output;
    }

    // Optimized approach - Time complexity -> O(n)
    public static ArrayList<Integer> sum2(int[] arr, int n, int s) {
        ArrayList<Integer> output = new ArrayList<>();

        int start = 0;
        int currentSum = arr[0];

        for (int i = 1; i <= n; i++) {

            while (currentSum > s && start < i - 1) {
                currentSum = currentSum - arr[start++];
            }

            if (currentSum == s) {
                int last = i - 1;
                output.add(start);
                output.add(last);
                break;
            }

            if (i < n) {
                currentSum = currentSum + arr[i];
            }
        }
        if (output.isEmpty()) {
            output.add(-1);
        }
        return output;
    }

}
