package methods;

public class MethodWithReturnType1 {
    public int multiplication(int a,int b, int c){
        int x=a*b*c;
        return x;
    }

    public static void main(String[] args) {
        MethodWithReturnType1 methodWithReturnType1=new MethodWithReturnType1();
        int x=methodWithReturnType1.multiplication(2,5,10);
       int x1= methodWithReturnType1.multiplication(1,20,30);

        System.out.println(x);
        System.out.println(x1);

    }

}
