package string;

public class StringMethods1 {
    public static void main(String[] args) {
        String s1="SHLOK ";
        String s2="SACHIN";
        String s3="DADHE";
        String s4=s1.concat(s2);

        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println(s1.concat(s3));
        System.out.println("The length of string s2 is " + s2.length());
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s1.charAt(3));
        System.out.println(s1.lastIndexOf("K"));
        System.out.println(s2.contains("S"));
        System.out.println(s3.isEmpty());
        System.out.println(s3.isBlank());
        System.out.println(s4.trim());
    }
}
