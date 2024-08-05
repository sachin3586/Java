package oops.plymorphism;

public class FinalStaticVariable
{ final static int s;

    FinalStaticVariable(){  // constructor may not be required


    }
    static {
        s=300;
    }

   



    public static void main(String[] args) {
        System.out.println(s);


    }
}
