package BinarySearch;

public class basic {
    public static int binarysearch(int arr[],int n, int target){
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(target==arr[mid]) return mid;
            else if(target>arr[mid]){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,3,6,7,8,13,20};
        int n=arr.length;
        int target=13;
        System.out.println(binarysearch(arr,n,target));
    }
}
