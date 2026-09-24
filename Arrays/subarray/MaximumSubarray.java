

public class MaximumSubarray {

    static int maximumSubarray(int[] arr) {
        int maxSum = arr[0];
        int sum = 0;

        int start = 0;
        int bestStart = 0;
        int bestEnd = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum > maxSum) {
                maxSum = sum;
                bestStart = start;
                bestEnd = i;
            }

            if (sum < 0) {
                sum = 0;
                start = i + 1;
            }
        }

        // Print maximum subarray
        System.out.print("Maximum subarray: [");

        for (int i = bestStart; i <= bestEnd; i++) {
            System.out.print(arr[i]);

            if (i < bestEnd) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
        System.out.println("Maximum sum: " + maxSum);

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {5, -10, 4, 6, -2, 3};

        maximumSubarray(arr);
    }
}