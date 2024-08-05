package methods;

public class StaticMethod {
    int a=10; int b=20; int add;

    public static void addition()
    {
        System.out.println("This is static method");

    }
    public static void main(String[] args) {

      //  addition();        // static method we call directly without creating object of that class
        NonStaticMethod nonStaticMethod=new NonStaticMethod();   // Non static method we call in other class
                                                                  // by creating instance of that class
        nonStaticMethod.addition();



    }
}
