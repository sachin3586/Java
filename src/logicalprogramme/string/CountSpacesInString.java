package logicalprogramme.string;

public class CountSpacesInString {
    public static void main(String[] args) {

        String s = "my name is sachin my name is dadhe";
        String [] s1=s.split("");
        int counter=0;
        for (int i=0;i<s1.length;i++){
            if (s1[i].equals(" ")){
                counter++;
            }
        }

        System.out.println(counter);

    }
}
