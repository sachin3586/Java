package wrapperclass;

public class AutoBoxing_UnBoxing {

    public static void main(String[] args) {

        // Autoboxing: int to Integer
        int num = 10;       // primitive data int type
        Integer i = num;    // converting primitive to respective wrapper classes

        // Unboxing: Integer to int
        int num2 = i;

        System.out.println("Original int: " + num);
        System.out.println("After autoboxing: " + i);
        System.out.println("After unboxing: " + num2);




    }
}

