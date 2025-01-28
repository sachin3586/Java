package logicalprogramme.array;

import java.util.HashSet;

public class RemoveOnlyDuplicates {

    public static void main(String[] args) {
        int [] num={10,20,45,3,3,4,5,78,95,45,45,10,45,20};

        HashSet<Integer> uniqueElement=new HashSet<>();
        for (int element:num){         // adding element to hashset
            uniqueElement.add(element);
        }
        for (int number:uniqueElement){     // printing hashset
            System.out.print(number + " ");
        }
    }
}
