package oops.abstractclass;

public abstract class AbstractDemoClass {
    // We cant create instance of abstract class
    // Abstract class can contain abstract method ,concrete method ,constructor,instance variable
    // Abstract class allow 0 to 100% abstraction
    int a;

    AbstractDemoClass(int x){
        a=x;
        System.out.println(a);

    }

    public abstract void display();

    public  void concreteMethod(){
        System.out.println("Concrete method from abstract class ");
    }

}
