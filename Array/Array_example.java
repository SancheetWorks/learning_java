public class Array_example {

    public static void main(String[] args) {
        int[] num = {10, 20, 30, 40};

        System.err.println(num.length);

        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.err.println(arr.length);  //Shows the length of the array

        for (int i = 0; i < arr.length; i++) {
            System.err.println(arr[i]);
        }
    }
}
