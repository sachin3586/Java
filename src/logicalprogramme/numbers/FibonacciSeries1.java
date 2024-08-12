package logicalprogramme.numbers;

public class FibonacciSeries1 {
    public static void main(String[] args) {
        int count=20;
        int x1=0; int x2=1;
        System.out.print("Fibonacci series is:" + x1 + " " + x2  );
        for (int i=2;i<=20;i++){
            int x3=x1+x2;
            System.out.print(" " + x3);
            x1=x2;
            x2=x3;
        }
    }
}
