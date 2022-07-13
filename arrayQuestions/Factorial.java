import java.util.ArrayList;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(897));
    }

    public static ArrayList<Integer> factorial(int N) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        // Initializing variables for carry and size of factorial number
        int carry = 0, size = 0;
        // Adding 1 to the first index
        result.add(0, 1);
        // Updating the size of the factorial number
        size = 1;

        // Factorial loop starts from 2
        int value = 2;

        // Loop runs untill value reaches N
        while (value <= N) {

            // Iterating the size of the factorial number
            for (int i = size - 1; i >= 0; i--) {

                // Calculating the product and adding the carry
                int product = result.get(i) * value + carry;

                // Replacing the 0th index with the mod of product
                result.set(i, product % 10);

                // Setting the carry
                carry = product / 10;
            }

            // Place the carry if there's no number to add with
            while (carry != 0) {
                result.add(0, carry % 10);
                carry = carry / 10;

                // Increasing the size of factorial number
                size++;
            }
            value++;
        }
        return result;
    }

}
