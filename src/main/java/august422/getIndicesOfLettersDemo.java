package august422;

import java.util.*;
import java.util.regex.Pattern;

public class getIndicesOfLettersDemo {
    public static void main(String[] args) {
        System.out.println(getIndicesOfLetters("Hello, my dear friend, please keep learning, I'll guarantee you'll reach the moment you understand everything"));
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
                    indices.add(i);
                }
            }
            result.put(uniqueLetter, indices);
        }

        return result;
    }
}
