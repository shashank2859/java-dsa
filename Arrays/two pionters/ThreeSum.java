import java.util.*;

public class ThreeSum {

    static List<List<Integer>> threeSum(int[] arr) {

        // Sort the array
        Arrays.sort(arr);

        // Store the unique triplets
        List<List<Integer>> result = new ArrayList<>();

        // Fix one element
        for (int i = 0; i < arr.length - 2; i++) {

            // Skip duplicate fixed elements
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = arr.length - 1;

            // Two pointers
            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (sum < 0) {
                    left++;
                }

                else if (sum > 0) {
                    right--;
                }

                else {
                    // Found a valid triplet
                    result.add(Arrays.asList(
                        arr[i],
                        arr[left],
                        arr[right]
                    ));

                    left++;
                    right--;

                    // Skip duplicate left values
                    while (left < right && arr[left] == arr[left - 1]) {
                        left++;
                    }

                    // Skip duplicate right values
                    while (left < right && arr[right] == arr[right + 1]) {
                        right--;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {-2, -2, 2, 1, 1, 0, 0, 0, 2, 2};

        List<List<Integer>> result = threeSum(arr);

        System.out.println(result);
    }
}