package Super;

public class Subclass extends SuperClass
{
    Subclass(){
        super();
        System.out.println("This is a subclass constructor");
    }

    public static void main(String[] args) {
        Subclass subclass=new Subclass();

    }
}
