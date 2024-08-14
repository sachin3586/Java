package logicalprogramme.numbers;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int x=151;
        int y=(1*1*1)+(5*5*5)+(1*1*1);
        System.out.println(y);
        if (x==y){
            System.out.println("Given number is armstrong number");
        }
        else {
            System.out.println("Number is not armstrong number");
        }
    }
}
