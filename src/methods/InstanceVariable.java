package methods;

public class InstanceVariable {

    int a=50;   // instance variable / global variable created in heap memory
   public static void Test(){
       int b=100;

    }

    public static void main(String[] args) {

        InstanceVariable variableTypes=new InstanceVariable();
       System.out.println(variableTypes.a);

       // For getting static variable outside class We call using that class name.variable name
        // i.e. static variable belongs to class ony not object

        System.out.println(StaticVariable.x);





    }
}
