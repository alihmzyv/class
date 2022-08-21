package august2122;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PossibleMoves {
    public static void main(String[] args) {
        System.out.println(possibleMoves("e4"));
    }
    public static List<String> possibleMoves(String pos) {
        char letter = pos.charAt(0);
        int digit = Integer.parseInt(String.valueOf(pos.charAt(1)));
        Stream<String> possibleMoves1 = IntStream.rangeClosed(1, 8)
                .filter(i -> i != digit)
                .boxed()
                .map(i -> String.format("%s%d", letter, i));

        Stream<String> possibleMoves2 = IntStream.rangeClosed(97, 104)
                .mapToObj(i -> (char) i)
                .filter(i -> i != letter)
                .map(i -> String.format("%s%d", i, digit));
        return Stream.concat(possibleMoves1, possibleMoves2).toList();
    }
}
