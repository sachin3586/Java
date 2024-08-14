package logicalprogramme.numbers;

public class FibSeriesExample {
    public static void main(String[] args) {
        int a1=0; int a2=1; int a3;
        System.out.print("Fibonacci series is " + a1 + " " + a2);
        int count=100;
        for (int i=2;i<100;i++){

            a3=a1+a2;
            System.out.print(" " + a3);
            a1=a2;
            a2=a3;
        }
    }
}
