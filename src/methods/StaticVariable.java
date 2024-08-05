package methods;

public class StaticVariable {
    // For memory management purpose static variables are created
    //Instance/Global variable belongs to object only & for accessing the same we must create instance  of that class
    //Static variable belongs to class only not to object

    static int x=101;

    public static void main(String[] args) {

        System.out.println("This is a static variable " + x);

// Note:- For access instance variable within/outside class also we need to create object/instance of that class

        InstanceVariable i=new InstanceVariable();
        System.out.println(i.a);
    }
}
