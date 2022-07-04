import java.util.HashMap;

public class SubarrWithEqualZeroAndOne {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 1, 0, 1, 1 };
        int n = arr.length;
        System.out.println(countSubarrWithEqualZeroAndOne(arr, n));
    }

    public static int countSubarrWithEqualZeroAndOne(int arr[], int n) {
        // add your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int output = 0;
        for (int i = 0; i < n; i++) {
            int pointer = arr[i];
            if (pointer == 0) {
                pointer = -1;
            }
            sum += pointer;

            if (sum == 0)
                output++;

            if (map.containsKey(sum)) {
                output += map.get(sum);
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }
        return output;
    }
}
