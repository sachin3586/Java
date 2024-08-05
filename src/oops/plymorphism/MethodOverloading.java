package oops.plymorphism;

public class MethodOverloading  // compile time polymorphism
    //1.method overloading means same method name with different parameter
    //2.method overloading always happen in single class only
    //3.we can achieve method overloading by changing number of parameter
    //4.we can achieve method overloading by changing data type of parameter
    // 5.we cant achieve method overloading by changing return type of the method
    //6.We can overload static method
    //7.we can overload java main method

{
    public void addition( int a,int b)
    {
        System.out.println(a+b);
    }
    public void addition(int a, int b,int c)
    {
        System.out.println(a+b+c);
    }
    public void addition(int a, float b, int c)
    {
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        MethodOverloading methodOverloading=new MethodOverloading();
        methodOverloading.addition(10,10);
        methodOverloading.addition(20,20.00f,40);
        methodOverloading.addition(50,100,200);
    }

}
