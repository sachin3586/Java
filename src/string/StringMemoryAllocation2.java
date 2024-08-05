package string;

public class StringMemoryAllocation2 {
    public static void main(String[] args) {

        String name1="SACHIN";  // stored in SCP (String Constant Pool) duplicates are not allowed
        String name2="SACHIN";

        System.out.println("name1 & name2 are stored in String Constant pool area ");
        System.out.println(name1.equals(name2));
        System.out.println(name1==name2);

        String name3=new String("SHLOK");
        String name4=new String("SHLOK");
        System.out.println("name3 and name 4 are stored in Heap memory");
        System.out.println(name3.equals(name4));
        System.out.println(name3==name4);
    }
}
