package methods;

public class JavaMethodAddition {
    // Method with parameter
    public void addition(int a,int b)         // Method haven't return type
    {
        System.out.println(a+b);
    }



    public static void main(String[] args) {
        JavaMethodAddition javaMethodAddition=new JavaMethodAddition(); // for method calling -we create object of same class
        javaMethodAddition.addition(140, 42);   // method called by passing parameter

        javaMethodAddition.addition(200 ,400);
    }
}
