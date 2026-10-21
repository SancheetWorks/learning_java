
public class Overloading_example {

    public static void main(String[] args) {
        Calculator obj = new Calculator();

        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10, 20, 30));
        System.out.println(obj.add(10, 20));
    }

}


class Calculator {

    public int add(int num1, int num2) {
        int res = num1 + num2;
        return res;
    }

    public int add(int num1, int num2, int num3) {
        int res = num1 + num2 + num3;
        return res;
    }

    public double add(double num1, double num2) {
        double res = num1 + num2;
        return res;
    }
}
