public class class1 {
    public static void main(String[] args) {
        int[] arr1 = new int[0];
        System.out.println(min(arr1));
    }

    public static int min(int[] arr) {

        int min = arr[0];

        for(var num: arr) {
            if (num<min) {
                min = num;
            }
        }

        return min;
    }

}
