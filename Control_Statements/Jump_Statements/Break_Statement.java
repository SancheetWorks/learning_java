public class Break_Statement {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            if(i == 4){
                break;
            }
            System.err.println(i);
        }
    }
}
