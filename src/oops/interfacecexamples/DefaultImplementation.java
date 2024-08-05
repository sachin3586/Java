package oops.interfacecexamples;

public class DefaultImplementation implements DefaultInterface ,DefaultInterface1{


    @Override                   // If we have common default methods then use "Super keyword with interface nane & Method"
    public void display() {
        DefaultInterface.super.display();
        DefaultInterface1.super.display();
    }

    public static void main(String[] args) {
        DefaultImplementation defaultImplementation=new DefaultImplementation();
        defaultImplementation.display();

    }
}
