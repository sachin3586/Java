package string;

public class StringSplitMethod {
    public static void main(String[] args) {
        String name="Shlok Sachin Dadhe";
       // String[] arr=name.split(  " ");

        String[] arr=name.split(" ");

        for (String s:arr){
            System.out.print(" " +s);
        }

    }



}
