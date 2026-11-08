package BinarySearch;

public class Search_rotates_sorted_arrayll {
    public static boolean  search(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;
            if(arr[mid]==target){
                return true;
            }

            if(arr[low]==arr[mid] && arr[mid]==arr[high]){
                high=high-1;
                low=low+1;
                continue;

            }
            else{
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

            
            
        }
            return false;
        }
    public static void main(String[] args) {
     int arr[]={6,10,20,6,6,7,6};
     int target=6;
     System.out.println(search(arr, target));
 }
}
