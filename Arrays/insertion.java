import java.util.Arrays;
class insertion{
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        System.out.println("Before Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        insertion_Sort(arr);

        System.out.println("\nAfter Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void insertion_Sort(int[] arr){

            int n = arr.length;
            for (int i = 1; i < n; i++) {
                int key = arr[i];  // Element to insert
                int j = i - 1;

                // Move elements greater than key one position ahead
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                }

                // Place key in its correct position
                arr[j + 1] = key;
            }
        }

}