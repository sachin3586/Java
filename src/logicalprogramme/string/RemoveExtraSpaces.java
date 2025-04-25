package logicalprogramme.string;

public class RemoveExtraSpaces {
    public static void main(String[] args) {
        String s="I am   Shlok            Dadhe";
        String newStr = s.trim().replaceAll("\\s+", " ");
        s.trim().replaceAll("\\s+"," ");
        System.out.println(newStr);







        
    }
}
