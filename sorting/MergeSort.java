public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 68, 69, 93, 62, 52, 64, 22, 72, 71, 44, 33, 20, 76, 21, 92, 85, 48, 80, 50, 84, 6, 35, 32, 25, 54, 3, 59, 77, 26, 89};
        int n = arr.length;
        divide(arr, 0, n - 1);
        printArray(arr);
    }

    public static void divide(int[] arr, int start, int end){
        if(start < end){
            int mid = (start + end) / 2;
            divide(arr, start, mid);
            divide(arr, mid + 1, end);
            conquer(arr, start, mid, end);
        }
    }

    private static void conquer(int[] arr, int start, int mid, int end) {
        int[] sortedArray = new int[end + 1];
        int i = start;
        int j = mid + 1;
        int k = start;

        // Checks both array conditions
        while(i <= mid && j <= end){
            // Adding items in the secondary array
            if(arr[i] < arr[j]){
                sortedArray[k++] = arr[i++];
            } else {
                sortedArray[k++] = arr[j++];
            }
        }

        if(i > mid){ // If the first array is exhausted
            while(j <= end){
                sortedArray[k++] = arr[j++];
            }
        } else { // If the second array is exhausted
            while(i <= mid){
                sortedArray[k++] = arr[i++];
            }
        }        

        // placing the sorted array in second array
        for(int x = start; x <= end; x++){
            arr[x] = sortedArray[x];
        }
    }

    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
