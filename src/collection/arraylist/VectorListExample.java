package collection.arraylist;

import java.util.Vector;

public class VectorListExample {
    // Vector is a legacy class of Array List
    // It is synchronized, low performance, and thread safe,
    //Rest of all same to Array list

    public static void main(String[] args) {
        Vector<String> vector=new Vector<>();
        vector.add("Hi Everyone");
        System.out.println(vector);
    }
}
