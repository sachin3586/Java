package Loops;

public class DivisibleBy3And5 {
    public static void main(String[] args)
    {
        for (int i=1;i<=30;i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println(i + " Number is divisible by 3 & 5  ");
            } else if (i%3==0)
            {
                System.out.println(i + " Number is divisible by 3 only");
            } else if (i%5==0)
            {
                System.out.println(i + " Number is divisible by 5 ");
            }
            else
            {
                System.out.println(i + " Number is neither divisible by 3 nor 5" );
            }
        }
    }
}
