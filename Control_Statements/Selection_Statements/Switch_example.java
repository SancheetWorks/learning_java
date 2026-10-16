package Control_Statements.Selection_Statements;

public class Switch_example {

    enum day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public static void main(String[] args) {

        day today = day.FRIDAY;
        System.out.println(today);


        switch(today) {
            case MONDAY:
                System.out.println("1st day of the week");
                break;

            case TUESDAY:
                System.out.println("2nd day of the week");
                break;

            case WEDNESDAY:
                System.out.println("3rd day of the week");
                break;

            case THURSDAY:
                System.out.println("4th day of the week");
                break;

            case FRIDAY:
                System.out.println("5th day of the week");
                break;

            case SATURDAY:
                System.out.println("6th day of the week");
                break;

            case SUNDAY:
                System.out.println("7th day of the week");
                break;

            default:
                System.err.println("Invaild Input");
                break;
        }
    }




    
}
