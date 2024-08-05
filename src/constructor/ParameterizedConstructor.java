package constructor;

public class ParameterizedConstructor {

    String name;
    int age;

    public ParameterizedConstructor(String name , int age){
        this.name=name;
        this.age=age;
    }

    public void displayInfo(){
        System.out.println("Name is " + name);
        System.out.println("Age is " +  age);
    }

    public static void main(String[] args) {
        ParameterizedConstructor pc=new ParameterizedConstructor("SACHIN DADHE",32);
        pc.displayInfo();
    }
}
