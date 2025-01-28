package string;

public class ImmutableString {
    public static void main(String[] args) {

        String name1="Sachin";

        // Attempt to modify string
        name1.concat("Dadhe").concat("Wafale");

        // print modified string but its immutable
        System.out.println(name1);

        //Assign modified string to other str variable

        String newName=name1.concat(" Dadhe").concat(" Wafale");
        System.out.println(newName);
    }
}
