package Loops;

public class Nested_for {
    public static void main(String[] args) {

        for (int i = 0; i <=3; i++) {         // outer for loop 3 times executes
            for (int j = 0; j <=3 ; j++) {     // inner for loop executes 9 times

                System.out.println(i + "  "+ j);

            }


        }
    }
}
