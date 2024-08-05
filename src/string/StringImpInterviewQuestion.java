package string;

public class StringImpInterviewQuestion {
    public static void main(String[] args) {
        String name1="Shlok";
        String name2=new String("Shlok");

        System.out.println(name1==name2);  // false--bcoz name1 object is created in SCP while name2 in Heap memory
        System.out.println(name1.equals(name2));  // true:-- objects are created in different memory but content is same

        //HEAP MEMORY -Dynamically allocated,Stores objects (including strings),Accessed through object references
        //SCP -- Special area within the heap , Created at program startup, Stores string literals,Accessed through string references
    }

}
