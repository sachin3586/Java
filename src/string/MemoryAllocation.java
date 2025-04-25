package string;

public class MemoryAllocation {
    public static void main(String[] args) {
        String s1="Sachin"; // scp area  // duplicates are not  allowed
        String s="Sachin";  // scp area // duplicates are not allowed

        String s2=new String("Sachin");  // heap memory
        String s3=new String("Sachin"); // heap memory

        System.out.println(s2.equals(s3));
        System.out.println(s2==s3);
        System.out.println(s1.equals(s));
        System.out.println(s1==s);  // true becoz both string pointing same address

        }
}
