
public class Reversed_array {

    public static void main(String[] args) {

        // using for loop
        int[] arr = {10, 20, 30, 40, 50};

        for (int i = 0; i <= arr.length / 2; i++) {
            int temp = arr[4 - i];
            arr[4 - i] = arr[i];
            arr[i] = temp;

        }

        for (int i = 0; i <= 4; i++) {
            System.out.println(arr[i]);
        }

        int[] arr1 = {10, 20, 30, 40, 50};

        System.err.println();   //Make space for new loop


        //Using while loop
        int start = 0;
        int end = arr1.length - 1;

        while (start < end) {
            int temp = arr1[start];
            arr1[start] = arr1[end];
            arr1[end] = temp;

            start++;
            end--;
        }

        for (int i = 0; i <= 4; i++) {
            System.out.println(arr1[i]);
        }

    }
}
