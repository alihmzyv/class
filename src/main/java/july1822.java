import java.util.Scanner;

public class july1822 {
    public static void main(String[] args) {
        countApplesAndOranges(7 ,11,
                5 ,15,
                        new int[]{-2, 2, 1}, new int[]{5, -6});

    }

    public static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int countApples = 0;
        int countOranges = 0;
        int locApple;
        int locOrange;

        for (int i = 0; i < apples.length; i++) {
            locApple = apples[i] + a;
            if(locApple>=s && locApple<=t) {
                countApples++;
            }
        }

        for (int i = 0; i < oranges.length; i++) {
            locOrange = oranges[i] + b;
            if(locOrange>=s && locOrange<=t) {
                countOranges++;
            }
        }

        System.out.println(countApples+"\n"+countOranges);
    }
}
