public class E_num {
    enum Day{
        Monday, 
        Tuesday, 
        Wednesday, 
        Thursday, 
        Friday, 
        Saturday,
        Sunday
    }

    public static void main(String[] args) {
        Day today = Day.Friday;
        System.out.println(today);
    }
}
