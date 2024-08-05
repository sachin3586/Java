package Super;

public class ElderBrother extends YoungerBrother {

    int a=100;
    public void bike(){

        super.bike();
        System.out.println("Royal Enfield bike");
    }

    public void print(){
        System.out.println("This is superclass variable " + super.a);
        System.out.println("This is subclass variable " + a);
    }

    public static void main(String[] args) {
        ElderBrother e=new ElderBrother();
        e.bike();
        e.print();


    }
}
