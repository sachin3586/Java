package Super;

public class ChildClass extends ParentClass {
    @Override
    public void display(){
        super.display();  // Calling Parent class display method

        System.out.println("This is a child class method");
    }

    public static void main(String[] args) {
        ChildClass childClass=new ChildClass();
        childClass.display();
    }
}
