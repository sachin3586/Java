package collection.arraylist;

import java.util.ArrayList;

public class AL_Retain_All {
    public static void main(String[] args) {
        ArrayList arrayList1=new ArrayList<>();
        arrayList1.add(2);
        arrayList1.add(5);
        arrayList1.add(10);
        arrayList1.add(25);

        ArrayList arrayList2=new ArrayList<>();
        arrayList2.add(5);arrayList2.add(10);

        System.out.println(arrayList1);
        System.out.println(arrayList2);

        arrayList1.retainAll(arrayList2);
        System.out.println(arrayList1);



    }
}
