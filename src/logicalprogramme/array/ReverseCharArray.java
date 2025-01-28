package logicalprogramme.array;

public class ReverseCharArray {
    public static void main(String[] args) {
        char [] ch={'s','a','c','h','i','n'};


        System.out.println("Array length is " + ch.length);
        for (int i=ch.length-1;i>=0;i--){

            System.out.print(ch[i] + " ");
        }
    }
}
