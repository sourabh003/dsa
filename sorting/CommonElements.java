import java.util.ArrayList;

public class CommonElements {
    public static void main(String[] args) {
        int[] A = { 1, 5, 10, 20, 40, 80 }, B = { 6, 7, 20, 80, 100 }, C = { 3, 4, 15, 20, 30, 70, 80, 120 };
        int n1 = 6, n2 = 5, n3 = 8;
        System.out.println(commonElements(A, B, C, n1, n2, n3));
    }

    public static ArrayList<Integer> commonElements(int[] A, int[] B, int[] C, int n1, int n2, int n3) {
        ArrayList<Integer> duplicates = new ArrayList<>();
        int x = 0, y = 0, z = 0;
        while (x < n1 && y < n2 && z < n3) {
            if (A[x] == B[y] && B[y] == C[z]) {
                if (!duplicates.contains(A[x])) {
                    duplicates.add(A[x]);
                }
                x++;
                y++;
                z++;
            } else if (A[x] < B[y]) {
                x++;
            } else if (B[y] < C[z]) {
                y++;
            } else {
                z++;
            }
        }

        return duplicates;
    }
}
