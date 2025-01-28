package string;

public class StrBfr {
    public static void main(String[] args) {

        String s="Shlok";
        StringBuffer sbf=new StringBuffer(s);
        sbf.reverse();
        System.out.println(sbf);
        sbf.append("  Dadhe");
        System.out.println(sbf);
        sbf.insert(0,"MR ");
        System.out.println(sbf);
        System.out.println(sbf.delete(0,3));
        System.out.println(sbf.replace(0,5,"Shlok"));


    }
}
