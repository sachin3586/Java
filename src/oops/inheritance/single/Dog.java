package oops.inheritance.single;

public class Dog extends Animal {
    public void bark(){

        System.out.println("Dog bark loudly");
    }

    public static void main(String[] args) {

        Dog dog=new Dog();
        dog.eat();
        dog.run();
        dog.bark();
    }

}
