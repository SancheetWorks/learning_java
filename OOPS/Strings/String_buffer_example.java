
public class String_buffer_example {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Sancheet");

        sb.append(" Grover");
        System.out.println(sb);

        sb.insert(0, "Mr. ");
        System.out.println(sb);

        sb.replace(0, 19, "Tejas Margaj");
        System.out.println(sb);

        sb.delete(0, 6);
        System.out.println(sb);

        System.out.println(sb.reverse());

        System.out.println(sb.length());

        System.out.println(sb.charAt(4));

        sb.setCharAt(2, 's');
        System.out.println(sb);

        System.out.println(sb.capacity());

        System.out.println(sb.substring(4, 6));

        sb.ensureCapacity(50);
        System.out.println(sb.capacity());

        sb.trimToSize();
        System.out.println(sb.capacity());

    }
}
