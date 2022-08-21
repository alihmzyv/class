package august2122;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PossibleMoves {
    public static void main(String[] args) {
        System.out.println(possibleMoves("e4"));
    }
    public static List<String> possibleMoves(String pos) {
        List<String> possibleMoves = new ArrayList<>();
        char letter = pos.charAt(0);
        int digit = Integer.parseInt(String.valueOf(pos.charAt(1)));
        List<String> possibleMoves1 = IntStream.rangeClosed(1, 8)
                .filter(i -> i != digit)
                .boxed()
                .map(i -> String.format("%s%d", letter, i))
                .collect(Collectors.toList());

        List<String> possibleMoves2 = IntStream.rangeClosed(97, 104)
                .mapToObj(i -> (char) i)
                .filter(i -> i != letter)
                .map(i -> String.format("%s%d", i, digit))
                .collect(Collectors.toList());
        possibleMoves.addAll(possibleMoves1);
        possibleMoves.addAll(possibleMoves2);
        return possibleMoves;
    }
}
