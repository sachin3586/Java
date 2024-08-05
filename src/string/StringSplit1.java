package string;

public class StringSplit1 {
    public static void main(String[] args) {
        String name="Sachin Dadhe SDET QA";
        String[] arr = name.split(" ");
        System.out.println(arr); // address of string array

        for (String s:arr){
            System.out.println(s);
        }
    }
}
