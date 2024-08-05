package oops.casting;

public class CallByValue {
    int a = 51;

    public void show(int a) {

        a = a + 50;
        System.out.println(a);
    }

    public static void main(String[] args) {
        CallByValue callByValue = new CallByValue();


        callByValue.show(50); // Call by value means we are passing value to method while calling the same method
        System.out.println(callByValue.a); // This is nothing but calling instance variable using class object

    }
}
