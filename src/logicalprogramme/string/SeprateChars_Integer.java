package logicalprogramme.string;

public class SeprateChars_Integer {
    public static void main(String[] args) {

        String s="SDDF5645DFDSF6565679FDF";
        StringBuilder numbers=new StringBuilder();
        StringBuilder chars=new StringBuilder();

        for (char c:s.toCharArray()){
            if (Character.isDigit(c)){
                numbers.append(c);

            }
            else if(Character.isLetter(c)) {
                chars.append(c);


            }
        }
        System.out.print(numbers.toString() + " ");
        System.out.println(chars.toString() + " ");
    }
}
