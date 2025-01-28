package logicalprogramme.array;

public class CharArray {
    public static void main(String[] args) {
        char [] ch={'s','a','c','h','i','n'};

        for (int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]+ " ");
        }
        System.out.println();
        for (int i=0;i<ch.length;i++){

            System.out.print(ch[i] +  " ");
        }
    }
}
