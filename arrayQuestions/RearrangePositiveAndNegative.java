import java.util.ArrayList;

import utils.Utils;

public class RearrangePositiveAndNegative {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, -1 };
        int n = arr.length;
        rearrange(arr, n);
        Utils.printArray(arr);
    }

    public static void rearrange(int arr[], int n) {
        // code here
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                negative.add(arr[i]);
            } else {
                positive.add(arr[i]);
            }
        }

        for (int i = 0; i < n; i++) {
            if (negative.size() == 0 && positive.size() != 0) {
                arr[i] = positive.get(0);
                positive.remove(0);
                continue;
            }

            if (positive.size() == 0 && negative.size() != 0) {
                arr[i] = negative.get(0);
                negative.remove(0);
                continue;
            }

            if (i % 2 == 0 && positive.size() != 0) {
                arr[i] = positive.get(0);
                positive.remove(0);
                continue;
            }
            if ((i % 2 != 0) && negative.size() != 0) {
                arr[i] = negative.get(0);
                negative.remove(0);
                continue;
            }
        }
    }
}
