import java.util.ArrayList;
import java.util.Arrays;

import utils.Utils;

public class LongestConsecutive {
    public static void main(String[] args) {
        int[] arr = { 8, 8, 9, 9, 3, 4, };
        int n = arr.length;
        System.out.println(longestConsecutive(arr, n));
    }

    public static int longestConsecutive(int[] arr, int n) {
        int low = 0;
        int high = n - 1;
        quickSort(arr, low, high);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] != arr[i]) {
                list.add(arr[i]);
            }
        }
        System.out.println("list => " + list);

        int ans = 0;
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < list.size(); i++) {
            if (i > 0 && list.get(i) - list.get(i - 1) == 1) {
                count++;
            } else {
                count = 1;
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (arr[i] <= pivot && i < high) {
                i++;
            }
            while (arr[j] > pivot && j >= low) {
                j--;
            }
            if (i < j) {
                Utils.swap(arr, i, j);
            }
        }
        Utils.swap(arr, low, j);
        return j;
    }
}
