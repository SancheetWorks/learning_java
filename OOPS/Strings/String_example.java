
public class String_example {

    public static void main(String[] args) {
        String name = "Sancheet";
        String name1 = "      Sancheet";
        String s = "Hello everyone I am a student";
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(2));
        System.out.println(name1.trim());
        System.out.println(name.substring(3));
        System.out.println(name.substring(3, 6));
        System.out.println(name.concat(" Grover"));
        System.out.println(name.contains("a"));
        System.out.println(name.startsWith("Sa"));
        System.out.println(name.replace("e", "i"));
        System.out.println(name.indexOf("c"));
        System.out.println(name.isEmpty());
        System.out.println(name.equals(name1));
        System.out.println(name.lastIndexOf(name));
        System.out.println(Integer.parseInt(name));
        
        String[] arr = s.split(" ");
        for (String str : arr){
            System.out.println(str);
        }
        
    }
}
