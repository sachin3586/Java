package logicalprogramme.numbers;

public class PrintNumberWithoutLoop {
    public static void main(String[] args) {
        printNumbers(1);
    }

    private static void printNumbers(int number) {
        if (number<=50){
            System.out.print(number +  " ");
            printNumbers(number+1);
        }
    }

}
