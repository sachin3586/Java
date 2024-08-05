package constructor;

public class ParameterizedConstructor1 {
    String name;
    int age;

    public ParameterizedConstructor1(String name ,int age){

        this.name=name;
        this.age=age;

    }
    public void Info(){
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
    }

    public static void main(String[] args) {
        ParameterizedConstructor1 parameterizedConstructor1=new ParameterizedConstructor1("SACHIN",32);
        parameterizedConstructor1.Info();
    }

}
