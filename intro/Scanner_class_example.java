
import java.util.Scanner;

public class Scanner_class_example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Name: " + name);

        System.out.println("Enter your Age: ");
        int age = sc.nextInt();
        System.out.println("Age: " + age);

        System.out.println("Enter your Salary: ");
        double salary = sc.nextDouble();
        System.out.println("Salary: " + salary);

        System.out.println("Are you a Developer: ");
        boolean iddev = sc.nextBoolean();
        System.out.println("Answer: " + iddev);

        sc.close();
    }
}
