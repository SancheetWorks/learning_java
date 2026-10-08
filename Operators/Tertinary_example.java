public class Tertinary_example {
    public static void main(String[] args) {
        Byte marks = 65;

        String result = marks >= 90 ? "Your Grade is A" : marks >= 80 ? "Your Grade is B" : marks > 70 ? "Your Grade is C" : marks > 60 ? "Your Grade is D" : marks > 50 ? "Your Grade is E" : "Your Grade is F";
        System.out.println(result);
    }
}
