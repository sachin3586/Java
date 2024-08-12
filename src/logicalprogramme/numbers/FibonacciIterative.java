package logicalprogramme.numbers;

public class FibonacciIterative {
    public static void main(String[] args) {
        int count = 10; // Number of terms
        int num1 = 0, num2 = 1;

        System.out.print("Fibonacci Series: " + num1 + " " + num2);

       for (int i = 2; i < count; ++i) {
            int num3 = num1 + num2;
            System.out.print(" " + num3);
           num1 = num2;
            num2 = num3;


        }


    }
}
