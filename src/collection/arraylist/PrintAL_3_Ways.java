package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintAL_3_Ways {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(100); al.add(200);al.add(300); al.add(250);
        al.add(25); al.add(48);al.add(87);
        al.add(70);

        System.out.println("printing given AL and list size="+ al.size());
        System.out.println(al);
        //1) Using for each loop
        for (Object element:al){
            System.out.print(element + " ");
        }
        System.out.println();
        // 2) using for loop
        for (int i=0;i<al.size();i++){
            System.out.print(al.get(i) + " ");
        }
        System.out.println();
        // 3) Using Iterator
        Iterator<Integer> iterator = al.iterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

    }
}
