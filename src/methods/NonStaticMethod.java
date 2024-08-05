package methods;

public class NonStaticMethod {

    public void addition()
    {

        System.out.println("This is non static method");
    }
    public static void main(String[] args) {

        // For calling non static method must need to create object of that class

        NonStaticMethod nonStaticMethod=new NonStaticMethod();
        nonStaticMethod.addition();
        StaticMethod.addition(); // can call static method directly by class name.method name OR create instance of class
                                                    // but for static method no need to create instance
        StaticMethod staticMethod=new StaticMethod();

       // staticMethod.addition();  // we can't call static method in other class even if we create the instance of that class.


    }
}
