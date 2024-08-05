package string;

public class StringBuffer1 {
    public static void main(String[] args) {

        String name="TATA POWER ";
        StringBuffer sb=new StringBuffer(name);
        System.out.println(sb);
        StringBuffer str = sb.append(20);
        System.out.println(str);
        System.out.println(sb.insert(0,"TCS"));
        System.out.println(sb.delete(1,2));
        System.out.println(sb.replace(1,2,"CHEMICAL"));
        System.out.println(sb.reverse());

    }
}
