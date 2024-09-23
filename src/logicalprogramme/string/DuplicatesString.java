package logicalprogramme.string;

public class DuplicatesString {

    public static void main(String[] args) {

        String s1="My name name is is sachin dadhe";
        String [] s2=s1.split(" ");
        int counter=0;
        for (int i=0;i<s2.length;i++){
            for (int j=i+1;j<s2.length;j++){
                if (s2[i].equals(s2[j])){

                    System.out.print(s2[i] + " ");
                    counter++;

                }
            }
        }
        System.out.println();
        System.out.println(counter);
    }
}
