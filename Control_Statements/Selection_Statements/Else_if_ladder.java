public class Else_if_ladder {
    public static void main(String[] args) {
        int marks = 75;

        if(marks > 90){
            System.out.println("You got A");
        }

        else if(marks > 80){
            System.out.println("You got B");
        }

        else if(marks > 70){
            System.out.println("You got C");
        }

        else if(marks > 60){
            System.out.println("You got D");
        }

        else{
            System.out.println("You got E");
        }
    }
}
