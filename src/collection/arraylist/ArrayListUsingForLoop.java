package collection.arraylist;

import java.util.ArrayList;

public class ArrayListUsingForLoop
{
    public static void main(String[] args) {
        ArrayList arrayList22=new ArrayList();
        // I can print array list using 3 ways
        // 1) Simple for loop 2) For each loop  3)Iterator with hasNext() & next() method

        // for changing only arraylist22 to arraylist33 --select arraylist22 -go to refactor change name -done
        arrayList22.add(50.21f);
        arrayList22.add(251);
        arrayList22.add(null);
        arrayList22.add(null);
        arrayList22.add("SACHIN");
        arrayList22.add("SACHIN");
        arrayList22.add("DADHE");

        System.out.println(arrayList22);
        // Using simple for loop
        for (int i=0;i<arrayList22.size();i++){
            System.out.println(arrayList22.get(i));

        }
    }
}
