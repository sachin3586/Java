package logicalprogramme.string;

public class SmallWordReverse {
    public static void main(String[] args) {
        String s="Hi I am Shlok Dadhe from Pune and I am Automation QA with selenium java Maven QA QA QA";
        String []s1=s.split(" ");
        String sWord=s1[0];

        for (int i=1;i<s1.length;i++){

            if (s1[i].length()<sWord.length()){
                sWord=s1[i];
            }
        }

        System.out.println("Smallest word :" + sWord);
        StringBuilder stringBuilder=new StringBuilder(sWord);
        System.out.println(stringBuilder.reverse().toString());

    }
}
