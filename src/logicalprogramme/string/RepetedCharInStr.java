package logicalprogramme.string;

public class RepetedCharInStr {
    public static void main(String[] args) {
        String s="sacsachihinn";
        int counter=0;
        for (int i=0;i<s.length();i++){
            for (int j=i+1;j<s.length();j++){
                if (s.charAt(i)==s.charAt(j)){
                    counter++;
                    System.out.print(s.charAt(i) + " ");
                }
            }
        }
        System.out.println();
        System.out.println(counter);


    }
}
