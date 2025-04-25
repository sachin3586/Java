package logicalprogramme.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReverseArrayWithoutForLoop {
    public static void main(String[] args) {

        int [] x={1,2,3,4,5};

        Integer [] y=new Integer[x.length];

        for (int i=0;i<x.length;i++){

            y[i]=x[i];    // vice versa for  Integer [] to int []
        }

        List<Integer> list = Arrays.asList(y);
        Collections.reverse(list);

        System.out.println(list);

        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}
