
import java.util.StringTokenizer;

public class StringTokenizer_example {

    public static void main(String[] args) {
        String str = "JAVA | DOTNET | C | C# | JAVASCRIPT | HTML";

        StringTokenizer st = new StringTokenizer(str, "| ");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
