import java.util.ArrayList;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr = { -1, -2, -3, -4, };
        int n = arr.length;
        System.out.println(kadane(arr, n));
    }

    /*
     * In Kadane's algorigthm if the subarray sum is less that 1 then it adds no
     * value to the further sum, so we discard it.
     * 
     * We make the value of sum = 0, whenever the sum goes below 0
     */

    public static int kadane(int[] arr, int n) {
        int biggestSum = 0;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            if (sum > biggestSum || biggestSum == 0) {
                biggestSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }

        return biggestSum;
    }

    public static int bruteForce(int[] arr, int n) {
        int biggestSum = 0;
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> subArray = new ArrayList<>();
            int sum = 0;
            for (int j = i; j < n; j++) {
                subArray.add(arr[j]);
                sum = sum + arr[j];
                System.out.println(subArray + " => " + sum);
                if (sum > biggestSum || biggestSum == 0)
                    biggestSum = sum;
            }
        }
        System.out.println("Biggest sum => " + biggestSum);
        return biggestSum;
    }
}
