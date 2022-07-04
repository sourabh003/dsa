import java.util.ArrayList;
import java.util.HashSet;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = { 6, 1, 2, 8, 3, 4, 7, 10, 5 };
        int n = arr.length;
        missingNumber(arr, n);
    }

    public static int missingNumber(int[] array, int n) {
        int num = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 1; i <= n; i++) {
            set.add(i);
        }

        for (int i = 0; i <= n - 1; i++) {
            if (set.contains(array[i])) {
                set.remove(array[i]);
            }
        }

        for (int value : set) {
            num = value;
        }
        return num;
    }
}
