package logicalprogramme;

public class StringReverse {

    public static void main(String[] args) {

        String str="Shlok Sachin Dadhe";

        StringBuffer sb=new StringBuffer(str);
        StringBuffer str1 = sb.reverse();

        // print original string
        System.out.println(str);
        // reverse order string

        System.out.println(str1);
    }

    }


