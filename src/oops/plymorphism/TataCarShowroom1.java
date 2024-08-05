package oops.plymorphism;

public class TataCarShowroom1 extends TataCarShowroom {   // Method overriding/Runtime polymorphism
    //1.method overriding means same method name and same signature/parameter
    //2.method overriding always happen in parent and child class
    //3.In overriding we can change implementation provided by super class in subclass
    //4.we cant achieve method overriding by changing no of parameter
    //5.we cant achieve method overriding by changing the data type of the customer
    //6.we cant achieve method overriding by changing the return type of the method
    //7.we cant override static method
    //8.we cant override java main method
    //9. we cant extend class having final declared.

    public void customerLounge(){
        System.out.println("Well maintained customer lounge is provided in Tata Showroom1");
    }
    @Override
    public void services(){

        System.out.println("In TATA Showroom1 Sales  are provided");
    }

   public static void main(String[] args) {
       TataCarShowroom1 tataCarShowroom1=new TataCarShowroom1();
       tataCarShowroom1.customerLounge();
       tataCarShowroom1.services();
   }
}
