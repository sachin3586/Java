package string;

public class StringSplit1 {
    public static void main(String[] args) {
        String name="Sachin Dadhe SDET QA";
        String[] arr = name.split(" ");
        System.out.println(arr); // address of string array

      /*  for (String s:arr){
            System.out.println(s);
        }

       */ // printing statement in reverse order

     /*   for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }

      */ // Reverse sentence and reverse each word in string

        for(int i=name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i) +"");
        }

    }
}
