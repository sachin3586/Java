package logicalprogramme.string;

public class RepeatedCharString {
    public static void main(String[] args) {
        String s1="My name is shlok dadhe is shlok dadhe";

        int counter=0;
        for (int i=0; i<s1.length();i++){

            for (int j=i+1;j<s1.length();j++){
                if (s1.charAt(i)==s1.charAt(j)){
                    System.out.println(s1.charAt(i));
                }
            }


        }
        System.out.println(counter);
    }
}
