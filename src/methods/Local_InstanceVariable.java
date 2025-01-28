package methods;

public class Local_InstanceVariable {
    int a=50;

    static int b=25;
    public void show(){
        int a=70;

        System.out.println("This is local variable " + a);
        System.out.println("This is instance variable " + this.a);
        System.out.println("This is static variable  " + Local_InstanceVariable.b);
    }


    public static void main(String[] args) {


        Local_InstanceVariable localInstanceVariable=new Local_InstanceVariable();
        localInstanceVariable.show();

    }
}
