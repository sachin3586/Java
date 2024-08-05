package javabasic;

public class Prefix_postfix
{
    public static void main(String[] args) {
        int a=15; int b ; int c;
        // Postfix operator- It assign value first then increase/decrease
         b=a--;
        c=b;

        //prefix operator firstly it increase/decrease then it assign
       // b=++a;
        //c=b;

       // b=--a;
        //c=b;


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
