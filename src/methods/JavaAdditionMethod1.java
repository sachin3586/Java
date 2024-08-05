package methods;

public class JavaAdditionMethod1 {
    //method with parameter
    public void addition(int a, int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {

        JavaAdditionMethod1 javaAdditionMethod1=new JavaAdditionMethod1();
        javaAdditionMethod1.addition(100,200);
        javaAdditionMethod1.addition(5, 10 );
    }
}
