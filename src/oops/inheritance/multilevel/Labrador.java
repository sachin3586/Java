package oops.inheritance.multilevel;

public class Labrador extends Dog1
{
    public void colour(){
        System.out.println("Labrador has  very shining black colour");
    }

    public static void main(String[] args) {
        Labrador labrador=new Labrador();
        labrador.eat();
        labrador.colour();
        labrador.bark();
    }
}
