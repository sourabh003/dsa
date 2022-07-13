import java.util.ArrayList;
import java.util.TreeMap;

public class Duplicates {
    public static void main(String[] args) {
        int[] arr = { 14, 7, 14, 6, 1, 11, 3, 16, 16, 8, 7, 4, 11, 15, 17, 6, 1, 13 };
        int n = arr.length;
        System.out.println(getDuplicates(arr, n));

    }

    public static ArrayList<Integer> getDuplicates(int[] arr, int n) {
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        ArrayList<Integer> duplicates = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) > 1) {
                duplicates.add(key);
            }
        }

        if (duplicates.size() == 0) {
            duplicates.add(-1);
        }
        return duplicates;
    }
}