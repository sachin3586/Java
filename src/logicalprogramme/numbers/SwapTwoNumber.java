package logicalprogramme.numbers;

public class SwapTwoNumber {

    public static void main(String[] args) {

       int a=25;
       int b=75;
        System.out.println("Numbers before swappings are a=" + a + " and b=" + b );
        System.out.println("Numbers after swapping are  ");
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("Numbers after swappings are a=" + a + " and b=" + b );
    }

}
