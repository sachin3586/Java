package oops.inheritance.hierarchical;

public class PizzaHut extends Pizza     // Child class 2
{
    public void spicyTest(){

        System.out.println("PizzaHut have spicy taste");
    }

    public static void main(String[] args) {

        PizzaHut pizzaHut=new PizzaHut();
        pizzaHut.taste();
        pizzaHut.spicyTest();
    }
}
