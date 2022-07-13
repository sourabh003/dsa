package utils;

public class Utils {

    public static void swap(int[] arr, int index1, int index2) {
        printSwappedArray(arr, index1, index2, true);
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        printSwappedArray(arr, index1, index2, false);
    }

    public static void printSwappedArray(int[] arr, int elem1, int elem2, boolean before) {
        for (int i = 0; i < arr.length; i++) {
            if (i == elem1) {
                String color = before ? "\033[42m" : "\033[43m";
                System.out.print(color + arr[i] + "\033[0m ");
            } else if (i == elem2) {
                String color = !before ? "\033[42m" : "\033[43m";
                System.out.print(color + arr[i] + "\033[0m ");
            } else {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("");
    }

    public static void printSwappedArray(int[] arr, int elem1, int elem2) {
        for (int i = 0; i < arr.length; i++) {
            if (i == elem1) {
                System.out.print("\033[42m" + arr[i] + "\033[0m ");
            } else if (i == elem2) {
                System.out.print("\033[43m" + arr[i] + "\033[0m ");
            } else {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("");
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}