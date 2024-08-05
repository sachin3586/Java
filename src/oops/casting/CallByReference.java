package oops.casting;

public class CallByReference {

    int x=71;

    public void show(CallByReference callByReference){

        x=x+100;
        System.out.println(x);
    }

    public static void main(String[] args) {
        CallByReference callByReference=new CallByReference();
        System.out.println(callByReference.x);  // Accessing instance variable using object its simpler
        callByReference.show(callByReference);   // Call by reference  mean calling method by passing object that's it
    }
}
