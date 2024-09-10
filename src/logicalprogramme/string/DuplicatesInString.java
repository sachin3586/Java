package logicalprogramme.string;

public class DuplicatesInString {

        public static void main(String[] args) {

            String str = "beautiful sea";
            char[] charArray = str.toCharArray();
            System.out.println("The string is: " + str);
            System.out.print("Duplicate Characters in above string are: ");
            // nested for loop to print duplicate characters
            for (int i = 0; i < str.length(); i++) {
                for (int j = i + 1; j < str.length(); j++) {
                    if (charArray[i] == charArray[j]) {
                        System.out.print(charArray[j] + " ");
                        break;
                    }
                }

            }

        }
    }



