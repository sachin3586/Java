package string;

public class StringMemoryAllocation1 {
    public static void main(String[] args) {
        // String literal always stored in string constant pool

        String name1="SHLOK";            //String literal
        String name2="SHLOK";
       // System.out.println(name1==name2);   // "==" symbol used for address comparison

        //OR
        System.out.println(name1.equals(name2)); // String content comparison

        String name3="SARIKA";  // name3 object is created in SCP(String Constant Pool)
        String name4=new String("SARIKA"); // name4 object is created in Heap area ,in heap area duplicates are allowed

        System.out.println(name3);
        System.out.println(name4);
        System.out.println(name3==name4);
        System.out.println(name3.equals(name4));
    }
}
