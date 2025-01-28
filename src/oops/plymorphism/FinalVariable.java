package oops.plymorphism;

public class
FinalVariable
{  final int a=50;   // When we declare final variable it can't be use anywhere else gives compile time error



    public static void main(String[] args) {
        FinalVariable f=new FinalVariable();
        System.out.println(f.a);
    }
}
