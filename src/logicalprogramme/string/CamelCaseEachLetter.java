package logicalprogramme.string;

public class CamelCaseEachLetter {
    public static void main(String[] args) {
        String s1=" i am sachin dadhe from pune";

        String [] s2=s1.split(" ");
        StringBuffer sb=new StringBuffer();

        for (String word:s2){
            sb.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase())
                    .append(" ");
        }

        String finalStr=sb.toString().trim();
        System.out.println(finalStr);

    }
}
