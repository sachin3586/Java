package string;

public class StringMemoryAllocation {
    public static void main(String[] args) {
        //String literal always stored in a string constant pool

        String name="SHLOK DADHE";  // string literal
        name= "SACHIN DADHE";       //Immutable

        System.out.println(name);
    }
}
