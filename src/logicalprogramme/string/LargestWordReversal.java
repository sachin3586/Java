package logicalprogramme.string;

public class LargestWordReversal {
    public static void main(String[] args) {
        String s = "My country name is India";
        String[] words = s.split(" "); // Split the string into words based on spaces
        String largestWord = "";

        for (String word : words) {
            if (word.length() > largestWord.length()) {
                largestWord = word;
            }

            
        }

        // Reverse the largest word using StringBuilder
        StringBuilder sb = new StringBuilder(largestWord);
        sb.reverse();

        System.out.println("Largest word: " + largestWord);
        System.out.println("Reversed largest word: " + sb);
    }
}
