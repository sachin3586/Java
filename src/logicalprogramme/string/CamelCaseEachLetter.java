package logicalprogramme.string;

public class CamelCaseEachLetter extends Demo{
    public static void main(String[] args) {
        String s1 = "i am sachin dadhe from pune";


        String []s2=s1.split(" ");
        StringBuilder sb=new StringBuilder();

        for (String word:s2){
            sb.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase())
                    .append(" ");

        }

        System.out.println(sb.toString());
    }
}
