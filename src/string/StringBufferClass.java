package string;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StringBufferClass {  // StringBuffer class is mutable
    //Methods in String Buffer Class
    public static void main(String[] args) {
        String name="SACHIN";
        StringBuffer sb=new StringBuffer(name);
        System.out.println(sb); // Printed string buffer variable;
        System.out.println(sb.append(" DADHE"));  // Add other string in existing string
        System.out.println(sb.insert(0, "RAJE "));
        System.out.println(sb);
        System.out.println(sb.replace(0, 2,"Wafale"));

        System.out.println(sb.delete(0, 8));
        System.out.println(sb.reverse());

    }





}
