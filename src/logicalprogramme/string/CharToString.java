package logicalprogramme.string;

public class CharToString {
    public static <Char> void main(String[] args) {
        char ch='S';


        // method 1
        String str=Character.toString(ch);
        System.out.println(ch);

        // method 2
        String str1=String.valueOf(ch);
        System.out.println(str1);
    }
}
