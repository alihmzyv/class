package november122;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FibonacciDemo {
    public static List<Integer> getFibonacciSequence(int firstN) {
        if (firstN <= 0) {
            throw new IllegalArgumentException("Number of elements should be greater than 0");
        }
        List<Integer> sequence = new ArrayList<>(firstN);
        IntStream.range(0, firstN)
                .forEach(i -> {
                    if (i == 0 || i == 1) {
                        sequence.add(i);
                    }
                    else {
                        sequence.add(sequence.get(i - 1) + sequence.get(i - 2));
                    }
                });
        return sequence;
    }

    public static void main(String[] args) {
        System.out.println(getFibonacciSequence(5));
    }
}
