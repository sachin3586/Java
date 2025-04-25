package logicalprogramme.numbers;

public class MultiplicationTableWithoutLoop {
    public static void main(String[] args) {

        printNumber(8);

    }
    public static void printNumber(int number){

        if (number<=80){
            System.out.println(number);
            printNumber(number+8);

        }
    }
}
