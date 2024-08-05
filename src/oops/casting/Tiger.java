package oops.casting;

public class Tiger extends Animal {
    public void control(){

        System.out.println("Tiger have control on maximum animal in forest ");
    }

    public static void main(String[] args) {

        Animal tiger=new Tiger();   // Upcasting means creates object of child class &it refer parent class
        tiger.eat();
        tiger.run();





        // DownCasting

        Tiger t=(Tiger) tiger;  // For down casting upcasting is compulsory -it refers upcasting object
        t.control();

        // Note: Instead of DownCasting we can simply use inheritance property of child class no need to use DownCasting

    }
}
