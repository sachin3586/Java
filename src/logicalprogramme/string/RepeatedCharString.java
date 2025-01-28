package logicalprogramme.string;

public class RepeatedCharString {
    public static void main(String[] args) {
        String s1="sachindadhe";
        System.out.println("Length of string is " + s1.length());

        int counter=0;
        for (int i=0; i<s1.length();i++){


          /*  for (int j=i+1;j<s1.length();j++){
                if (s1.charAt(i)==s1.charAt(j)){
                    System.out.print(s1.charAt(i) + " ");
                    counter++;
                }
            }

           */
            if (s1.charAt(i)=='a'){
                counter++;
                System.out.print(s1.charAt(i) + " ");
            }


        }
        System.out.println(counter);
    }
}
