package javabasic;

public class Operator_Examples1 {
    public static void main(String[] args) {

        int a=10; int b=20; int c=5; int d=10;
        // Relational operator

        System.out.println(a>b);
        System.out.println(a<b);

        System.out.println(a>=c);
        System.out.println(b<=c);
        //Equality operator

       System.out.println(a==d);
       System.out.println(b!=c);

       // logical && operator

        //System.out.println(a>c && d<c);
        System.out.println(a<c || d<c);
    }
}
