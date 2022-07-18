import java.util.Scanner;

public class july1822 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int s = Integer.parseInt(sn.nextLine().split(" ")[0]);
        int t = Integer.parseInt(sn.nextLine().split("")[1]);
        int a = Integer.parseInt(sn.nextLine().split("")[0]);
        int b = Integer.parseInt(sn.nextLine().split("")[1]);
        int m = Integer.parseInt(sn.nextLine().split("")[0]);
        int n = Integer.parseInt(sn.nextLine().split("")[1]);

        //apples distances from a
        String[] applesDistStrArr = sn.nextLine().split(" ");
        int[] applesDist = new int[m];

        for (int i = 0; i < applesDist.length; i++) {
            applesDist[i] = Integer.parseInt(applesDistStrArr[i]);
        }

        //orange distances from b
        String[] orangesDistStrArr = sn.nextLine().split(" ");
        int[] orangesDist = new int[m];

        for (int i = 0; i < orangesDist.length; i++) {
            orangesDist[i] = Integer.parseInt(orangesDistStrArr[i]);
        }

        countApplesAndOranges(s, t, a, b, applesDist, orangesDist);

    }

    public static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int countApples = 0;
        int countOranges = 0;

        for (int i = 0; i < apples.length; i++) {
            int locApple = apples[i] + a;
            if(locApple>s && locApple<t) {
                countApples++;
            }
        }

        for (int i = 0; i < oranges.length; i++) {
            int locOrange = oranges[i] + b;
            if(locOrange>s && locOrange<t) {
                countOranges++;
            }
        }

        System.out.println(countApples+"\n"+countOranges);
    }
}
