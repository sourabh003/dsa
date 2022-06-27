import java.util.HashSet;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int n = a.length;
        int[] b = { 1, 2, 3 };
        int m = b.length;
        System.out.println("Result => " + doUnion(a, n, b, m));
    }

    /*
     * Using set because set prevents duplicate entries.
     * 
     * Time complexity - O( m*log(m) + n*log(n) )
     */

    public static int doUnion(int a[], int n, int b[], int m) {
        HashSet<Integer> list = new HashSet<>();
        for (int i = 0; i < n; i++) {
            list.add(a[i]);
        }
        for (int i = 0; i < m; i++) {
            list.add(b[i]);
        }
        return list.size();
    }
}
