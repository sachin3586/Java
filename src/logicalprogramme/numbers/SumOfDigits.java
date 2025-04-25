package logicalprogramme.numbers;

public class SumOfDigits {
    public static void main(String[] args) {

        int a=456;
        int sum=0;
        String s = String.valueOf(a);
        for (int i=0;i<s.length();i++){

            int digit=Character.getNumericValue(s.charAt(i));
            sum=sum+digit;
        }
        System.out.println("Sum of digit is " + sum);


    }
}
