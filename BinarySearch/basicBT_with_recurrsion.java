package BinarySearch;

public class basicBT_with_recurrsion {
    public static int binarysearch(int arr[],int low, int high,int target){
       if(low>high){
        return -1;
       }
            int mid=(low+high)/2;
            if(target==arr[mid]) return mid;
            else if(target>arr[mid]){
               return binarysearch(arr,mid+1,high,target);
            }
            else {
               return binarysearch(arr,low,mid-1,target);
            }
    }
    public static void main(String[] args) {
        int arr[]={1,3,6,7,8,13,20};
        int low=0;
        int high=arr.length-1;
        int target=8;
        System.out.println(binarysearch(arr,low,high,target));
    }
}
    

