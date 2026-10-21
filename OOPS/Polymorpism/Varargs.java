class Calculator {

    public int add(int... numbers) {
        int sum = 0;

        for (int n : numbers) {
            sum += n;
        }

        System.out.println(sum);
    }
}

public class Varargs {

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10, 20, 30));
    }
}
