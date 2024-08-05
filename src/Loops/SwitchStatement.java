package Loops;

public class SwitchStatement
{
    public static void main(String[] args)
    {
        int num=5;
        String Result;
        switch (num)
        {
            case 1: Result="Passed";
            break;
            case 2: Result="Failed";
            break;
            case 3: Result="Passed with distinction";
            break;
            case 4: Result="Passed with first class";
            break;
            case 5: Result="Failed";
            break;
            default: Result="Enter valid number";
            break;


        }

        System.out.println(Result);

    }

}



