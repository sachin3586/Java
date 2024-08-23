package logicalprogramme.string;

public class Swap2Strings {
    public static void main(String[] args) {

        String s1="SACHIN";
        String s2="SHLOK";
        System.out.println("String before swap " + "s1 is " + s1 + " and s2 is " + s2);

        //After swapping
        String temp=s1;
        s1=s2;
        s2=temp;

        System.out.println("After swapping s1 is  " + s1);
        System.out.println("After swapping s2 is " + s2);
    }
}
