package collection.arraylist;

import java.util.ArrayList;

public class ArrayListWithRetainAll {
    public static void main(String[] args) {
        ArrayList arrayList1=new ArrayList();
        arrayList1.add("SHLOK");
        arrayList1.add("DADHE");
        arrayList1.add(151);

        ArrayList arrayList2=new ArrayList();
        arrayList2.add("SHLOK");
        arrayList2.add("DADHE");
        arrayList2.add(151);
        arrayList2.add(3586);
        System.out.println("Before applying retain all method");
        System.out.println(arrayList1);
        System.out.println(arrayList2);

        // retainAll() will give matching element in both list on which it is applied
        arrayList2.retainAll(arrayList1);
        System.out.println(arrayList2);
    }
}
