public class GetPairs {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 7, 1 };
        int n = arr.length;
        int k = 6;
        System.out.println(getPairs(arr, n, k));
    }

    public static int getPairs(int[] arr, int n, int k) {
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            int j = 0;
            while (j < n) {
                if (j != i) {
                    int tempSum = arr[i] + arr[j];
                    System.out.println(arr[i] + " + " + arr[j] + " = " + tempSum);
                    if (tempSum == k)
                        pairs++;
                }
                j++;
            }
        }
        return pairs;
    }
}