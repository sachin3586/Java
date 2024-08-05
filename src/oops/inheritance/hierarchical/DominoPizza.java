package oops.inheritance.hierarchical;

public class DominoPizza extends Pizza    // Subclass 1
{
    public void types()
    {
        System.out.println("Available in veg ,non veg and cheese");
    }

    public static void main(String[] args) {
        DominoPizza dominoPizza=new DominoPizza();
        dominoPizza.taste();
        dominoPizza.types();
    }
}
