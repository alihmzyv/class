package august422;

import java.util.*;
import java.util.regex.Pattern;

public class getIndicesOfLettersDemo {
    public static void main(String[] args) {
        System.out.println(getIndicesOfLetters("Hello, my dear friend, please keep learning, I'll guarantee you'll reach the moment you understand everything"));
    }

    public static HashMap<Character, List<Integer>> getIndicesOfLetters(String str) {
        HashMap<Character, List<Integer>> result = new HashMap<>();

        String letters = str.toLowerCase().replaceAll("[^a-z]", ""); //convert to lowercase, erase non-letter characters

        //get the letters as Character[]
        Character[] lettersArr = new Character[letters.length()];
        for (int i = 0; i < letters.length(); i++) {
            lettersArr[i] = letters.charAt(i);
        }

        //get Set of letters
        HashSet<Character> uniqueLetters = new HashSet<>(Arrays.asList(lettersArr));


        Character ch;
        List<Integer> indices;
        for (char letter: uniqueLetters) {
            indices = new ArrayList<>();
            for (int i = 0; i < str.length(); i++) {
                if (letter == str.charAt(i)) {
                    indices.add(i);
                }
            }
            result.put(letter, indices);
        }

        return result;
    }
}
