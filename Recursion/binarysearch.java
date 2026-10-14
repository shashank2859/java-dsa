package Recursion;


public class binarysearch {
public static int recurrsive_binarysearch(int arr[],int low, int high, int target) {
if(low>high)
    return -1;
    int mid=(low+high)/2;
if(arr[mid] == target)
    return mid;
else if(target>arr[mid])
    return recurrsive_binarysearch(arr,mid+1,high, target);
else
    return recurrsive_binarysearch(arr,low,mid-1, target);
}
public static void main(String[] args) {
    int arr[]= {3,4,5,6,7,9,5,10};
    int target=5;
    int low=0;
    int high=arr.length-1;
    System.out.println("index of target ="+recurrsive_binarysearch(arr, low,high, target)); 

}
}