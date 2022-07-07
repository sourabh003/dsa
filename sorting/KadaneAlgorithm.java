import java.util.ArrayList;
import java.util.HashMap;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr = { -1, -2, -3, -4 };
        int n = arr.length;
        bruteForce(arr, n);
    }

    public static int bruteForce(int[] arr, int n) {
        int biggestSum = 0;
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> subArray = new ArrayList<>();
            int sum = 0;
            for (int j = i; j < n; j++) {
                subArray.add(arr[j]);
                sum += arr[j];
                System.out.println(subArray + " => " + sum);
                if (sum > biggestSum || biggestSum == 0)
                    biggestSum = sum;
            }
        }
        System.out.println("Biggest sum => " + biggestSum);
        return biggestSum;
    }
}
