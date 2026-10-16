
public class Recursion {

    static void countdown(int n) {
        if (n == 0) {
            System.out.println("Done!!..");
        } else {
            System.out.println(n);
            countdown(n - 1);
        }
    }

    static void countdown2(int n) {
        if (n == 0) {
            System.out.println("Done!!..");
        } else {
            countdown2(n - 1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        countdown(5); // This will show 5,4,3,2,1 as after each method the answer is getting printed
        countdown2(5); // This will show 1,2,3,4,5 coz it is using FILO after the base condition is staisfied (After all the methods are done) and then prints the answer
    }
}
