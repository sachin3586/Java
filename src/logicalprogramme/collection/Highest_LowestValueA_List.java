package logicalprogramme.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Highest_LowestValueA_List {
    public static void main(String[] args) {

        ArrayList<Integer> number=new ArrayList<>();
        number.add(5);
        number.add(8);
        number.add(74);
        number.add(100);
        number.add(31);
        number.add(9);
        System.out.println(number);

        Collections.sort(number);
        // print arraylist for each loop
        for (int num:number){
            System.out.print(num + " ");
        }
        System.out.println();

        // using iterator

       Iterator iterator=number.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        System.out.println(" lowest number in arraylist is " + number.get(0) );
        System.out.println("Highest number in array is  " + number.get(number.size()-1));

    }
}
