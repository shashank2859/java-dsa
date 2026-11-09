package BinarySearch;

public class Search_rotates_sorted_array {
    public static int search(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;
            if(arr[mid]==target){
                return mid;
            }

            if(arr[low] < arr[mid] ){
                if(arr[low]<=target && target< arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(arr[high]>arr[mid]){
                    if(arr[mid]<target && target<=arr[high]){
                        low=mid+1;
                    }
                    else{
                        high=mid-1;
                    }
                }
            }

           
        }
        return -1;
    }
    public static void main(String[] args) {
     int arr[]={9,10,20,6,7,8};
     int target=20;
     System.out.println(search(arr, target));
 }
}

