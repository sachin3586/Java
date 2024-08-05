package constructor;

// Default constructor

public class NonParameterizedConstructor {
     String name;
     int age;

     public NonParameterizedConstructor(){
         name="SACHIN DADHE";
         age=30;
     }

     public void displayInfo(){
         System.out.println("Name of person  is     " + name);
         System.out.println("Age of person is " + age);
     }

    public static void main(String[] args) {

         NonParameterizedConstructor p=new NonParameterizedConstructor();
         p.displayInfo();

    }
}
