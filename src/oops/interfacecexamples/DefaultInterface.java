package oops.interfacecexamples;

public interface DefaultInterface {
    // We can declare default method with implementation within interface only
    // We can declare static method in interface with implementation
    // If we have same

    public default void display(){
        System.out.println("This is a default display method original");
    }
    public static void show(){
        System.out.println("Showing Static method within interface");
    }

    public static void main(String[] args) {
        show();

    }
}
