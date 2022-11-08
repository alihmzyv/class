package september122.task;

import java.util.Stack;
import java.util.regex.Pattern;

public class ParenthesesDemo {
    public static void main(String[] args) {
        System.out.println(findDeepestLevel("{{{{{}}}}}"));
    }
    public static int findDeepestLevel(String str) {
        String onlyParentheses = str.replaceAll("\\s", "");
        if (!Pattern.matches("^[{}]+", onlyParentheses) || !isValid(onlyParentheses)) {
            throw new IllegalArgumentException(String.format("'%s' is not valid.", onlyParentheses));
        }
        int[] level = {0};
        return onlyParentheses.chars()
                .map(i -> {
                    if ((char) i == '{') {
                        level[0]++;
                    }
                    else {
                        level[0]--;
                    }
                    return level[0];
                })
                .sorted()
                .toArray()
                [onlyParentheses.length() - 1];
    }

    public static boolean isValid(String s) {

        Stack<Character> brackets = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (bracketIsOpen(ch)) {
                brackets.push(ch);
            }
            if (bracketIsClose(ch)) {
                if (brackets.isEmpty()) { //closed bracket cannot come first
                    return false;
                }

                Character lastBracket = brackets.peek();
                if (!bracketCorresponds(ch, lastBracket)) {
                    return false;
                }
                brackets.pop();
            }
        }

        return brackets.isEmpty();
    }

    public static boolean bracketCorresponds(char closed, char open) {
        String openBrackets = "([{<";
        String closedBrackets = ")]}>";

        return closedBrackets.indexOf(closed) == openBrackets.indexOf(open);
    }

    public static boolean bracketIsOpen(char bracket) {
        String openBrackets = "([{<";
        return openBrackets.contains(String.valueOf(bracket));
    }

    public static boolean bracketIsClose(char bracket) {
        String closedBrackets = ")]}>";
        return closedBrackets.contains(String.valueOf(bracket));
    }
}