package logicalprogramme.string;

public class RepeatedWords {
    public static void main(String[] args) {

        String s="Hi my my  name is my  my sachin dadhe my ";
        String [] s1=s.split(" ");
        String wordFind="my";
        int counter=0;

      /*  for (String word:s1){
            if (word.equals(wordFind)){
                counter++;
            }

        }
        System.out.println("Given word repeats " + counter  );

       */
        for (int i=0;i<s1.length;i++){
            if (s1[i].equals(wordFind)){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
