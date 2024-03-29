package august422;

import java.util.*;
import java.util.regex.Pattern;

public class getIndicesOfLettersDemo {
    public static void main(String[] args) {
        HashMap<Character, List<Integer>> result = getIndicesOfLetters("X,sdjgss");
        for (char key: result.keySet()) {
            System.out.printf("%s: count = %d, indices: %s\n", key, result.get(key).size(), result.get(key));
        }
    }

    public static HashMap<Character, List<Integer>> getIndicesOfLetters(String str) {
        HashMap<Character, List<Integer>> result = new HashMap<>();
        str = str.toLowerCase();

        //get the letters as Character List
        List<Character> letters = new ArrayList<>();
        char letter;
        for (int i = 0; i < str.length(); i++) {
            letter = str.charAt(i);
            if (Character.isLetter(letter)) {
                letters.add(letter);
            }
        }

        //get Set of letters
        HashSet<Character> uniqueLetters = new HashSet<>(letters);


        //map into key: letter, value: indices
        for (var uniqueLetter: uniqueLetters) {
            List<Integer> indices = new ArrayList<>();
            for (int i = 0; i < str.length(); i++) {
                if (uniqueLetter == str.charAt(i)) {
                    indices.add(i + 1);
                }
            }
            result.put(uniqueLetter, indices);
        }

        return result;
    }
}
