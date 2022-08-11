package august1122;

import java.util.*;

public class FindSubintervals {
    public static void main(String[] args) {
        count(Arrays.asList(new Interval(1, 10), new Interval(1, 4), new Interval(2, 7), new Interval(5, 8), new Interval(1, 3), new Interval(7, 8)));
    }

    public static void count(List<Interval> intervals) {
        Collections.sort(intervals);
        SortedSet<Integer> boundsSorted = new TreeSet<>();
        for (Interval interval: intervals) {
            boundsSorted.add(interval.getLowerBound());
            boundsSorted.add(interval.getUpperBound());
        }



        SortedMap<Interval, Integer> intervalCountSortedMap = new TreeMap<>();
        Iterator<Integer> integerIterator = boundsSorted.iterator();

        while (integerIterator.hasNext()) {
            Interval interval = new Interval(integerIterator.next(), integerIterator.next());
            int count = 0;

            for (Interval intervalGiven: intervals) {
                if (isSubinterval(interval, intervalGiven)) {
                    count++;
                }
            }

            intervalCountSortedMap.put(interval, count);
        }

        System.out.println(intervalCountSortedMap);
    }

    public static boolean isSubinterval(Interval i1, Interval i2) {
        return i1.getLowerBound() >= i2.getLowerBound() && i1.getUpperBound() <= i2.getUpperBound();
    }
}

class Interval implements Comparable<Interval> {
    private int lowerBound;
    private int upperBound;

    public Interval(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public int getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(int lowerBound) {
        this.lowerBound = lowerBound;
    }

    public int getUpperBound() {
        return upperBound;
    }

    public void setUpperBound(int upperBound) {
        this.upperBound = upperBound;
    }

    @Override
    public int compareTo(Interval o) {
        int result = lowerBound - o.lowerBound;
        if (result == 0) {
            return upperBound - o.upperBound;
        }

        return result;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d) --> ", lowerBound, upperBound);
    }
}
