package string;

public class StringMethods {
    public static void main(String[] args) {

        String name1="SACHIN       ";
        String name2="DADHE";
        String name3="shlok";
        String name4=name1.concat(name2);
        System.out.println(name1.equals(name2));
        System.out.println("Length of this string is " +name1.length());
        System.out.println("The char at given index is " + name1.charAt(2));
        System.out.println(name2.compareTo(name1)); // If both strings are same then it return zero value,
                                                    // first greater than second it return positive number else it return negative number
        System.out.println(name1.concat(" " +name2));
        System.out.println(name1.toLowerCase());
        System.out.println(name3.toUpperCase());
        System.out.println(name4);
        System.out.println(name4.trim());  // Removes spaces of string at starting as well as at the end of string
    }
}
