package logicalprogramme.numbers;

public class SwapTwoNumber {

    public static void main(String[] args) {

        int x=10;
        int y=5;

        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println(x);
        System.out.println(y);
    }

}
