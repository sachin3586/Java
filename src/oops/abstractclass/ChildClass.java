package oops.abstractclass;

public class ChildClass extends AbstractDemoClass {

    ChildClass(int x) {
        super(x);
    }

    @Override
    public void display() {
        System.out.println("Display method implemented");
    }

    @Override           // We can override concrete methods from abstract class

    public void concreteMethod() {
        System.out.println("Concrete method override successfully");

    }

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass(100);
        childClass.display();
        childClass.concreteMethod();

        // System.out.println(childClass.a);
    }
}
