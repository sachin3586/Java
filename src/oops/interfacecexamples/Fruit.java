package oops.interfacecexamples;

public class Fruit implements Mango ,Apple{
    // Even though methods are same in both interface but we dont have implementation in interface
    // we provide method implementation in implemented class thats why multiple inheritance resolve here


    public void colour(){
        System.out.println("Mango Colour is yellow");
    }

    @Override
    public void taste() {
        System.out.println(" Mango Taste is sweet");
    }

    @Override
    public void price() {
        System.out.println("Mango Price is low");
    }

    public void price1(){
        System.out.println("Apple price is  more than mango");
    }

    public static void main(String[] args) {

        Fruit fruit=new Fruit();
        fruit.colour();
        fruit.taste();
        fruit.price();
        fruit.price1();
    }
}

