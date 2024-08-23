package logicalprogramme.numbers;

public class FactorialNumber {
    public static void main(String[] args) {
        long x=6;
        long factorial=1;
        for (long i=x;i>=1;i--){

            factorial=factorial*i;


        }

        System.out.println(factorial);
    }
}
