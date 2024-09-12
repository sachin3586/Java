package logicalprogramme.string;

public class ReverseString {
    public static void main(String[] args) {
        String s="SHLOK SACHIN DADHE I am Automation ,Manual SDET ENGINEER";

        for (int a=s.length()-1;a>=0;a--){
            System.out.print(s.charAt(a));
        }
    }
}
