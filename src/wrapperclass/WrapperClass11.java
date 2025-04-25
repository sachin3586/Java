package wrapperclass;

public class
WrapperClass11 {
    public static void main(String[] args) {

        int a=10;  // primitive data type int
        System.out.println("Primitive int type data a=" + a);

        Integer b=a; // converted primitive to resp wrapper class
        System.out.println(b);


        int c=b;  // unboxing

        System.out.println(c);
    }


}
