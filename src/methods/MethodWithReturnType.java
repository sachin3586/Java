package methods;

public class MethodWithReturnType {
    public int multiplication(int x,int y,int z){

        int multi=x*y*z;
        return multi;


    }

    public static void main(String[] args) {
        MethodWithReturnType methodWithReturnType=new MethodWithReturnType();
        int multi= methodWithReturnType.multiplication(10,2 ,2);

        System.out.println(multi);

    }
}
