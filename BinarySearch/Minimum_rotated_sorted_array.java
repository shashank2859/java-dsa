package BinarySearch;

public class Minimum_rotated_sorted_array {
    public static int findMin(int[] arr) {
        int left = 0, right = arr.length - 1;
        while(left < right) {
            int mid = left + (right - left) / 2;

            if(arr[mid] < arr[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return arr[left];
    }
    public static void main(String[] args) {
     int arr[]={9,10,20,6,7,8};
     System.out.println(findMin(arr));
 }
}