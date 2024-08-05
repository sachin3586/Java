package oops.interfacecexamples;

public class Fruit implements Apple,Mango{
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

    public static void main(String[] args) {

        Fruit fruit=new Fruit();
        fruit.colour();
        fruit.taste();
        fruit.price();
    }
}

