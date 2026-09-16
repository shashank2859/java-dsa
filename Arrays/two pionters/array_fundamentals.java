public class array_fundamentals {

    static int secondLargest(int[] arr) {

        int max = arr[0];
        int secmax = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                secmax = max;
                max = arr[i];
            }
            else if (arr[i] > secmax) {
                secmax = arr[i];
            }
        }

        return secmax;
    }
    public static void main(String[] args) {

        int[] arr = {10, 5, 8, 20, 15};

        System.out.println(secondLargest(arr));
    }
}