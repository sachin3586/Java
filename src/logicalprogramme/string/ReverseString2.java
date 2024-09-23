package logicalprogramme;

public class ReverseString2 {
    public static void main(String[] args) {
        String city="This is a Pune city and its a metro city";
        String [] reverse=city.split(" ");

        for (int i= reverse.length-1;i>=0;i--){

            System.out.print(reverse[i] + " ");
        }
    }
}
