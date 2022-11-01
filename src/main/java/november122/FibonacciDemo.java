package november122;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FibonacciDemo {
    public static List<Integer> getFibonacciSequence(int firstN) {
        List<Integer> sequence = new ArrayList<>();
        if (firstN == 1) {
            sequence.add(0);
            return sequence;
        }
        if (firstN == 2) {
            sequence.addAll(List.of(0, 1));
            return sequence;
        }
        sequence.addAll(List.of(0, 1));
        IntStream.range(2, firstN)
                .forEach(i -> sequence.add(sequence.get(i - 1) + sequence.get(i - 2)));
        return sequence;
    }

    public static void main(String[] args) {
        System.out.println(getFibonacciSequence(10));
    }
}
