package BinarySearch;

public class Search_rotates_sorted_array {
    public static int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // Target found
            if (nums[mid] == target) {
                return mid;
            }

            // Check if left half is sorted
            if (nums[low] <= nums[mid]) {

                // Check if target lies in left half
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

            }
            // Otherwise, right half is sorted
            else {

                // Check if target lies in right half
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
     int nums[]={1,3,5,6,7,8,8,19,20};
     int target=8;
     System.out.println(search(nums, target));
 }
}

