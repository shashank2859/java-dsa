package BinarySearch;

import java.util.Arrays;

public class First_and_last_occurance {
    public static int lowerbound(int arr[],int target,int n){
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target){
                ans=mid;
                high=mid-1;
                
            }
            else{
                low=mid+1;
            }
        }
        return ans;

    }
    public static int upperbound(int arr[],int target,int n){
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target){
                ans=mid;
                high=mid-1;
                
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int[] first_last_occurance(int arr[],int target,int n){
        int lb = lowerbound(arr, target, n);
        if(lb == n || arr[lb] != target)  {
            return new int[]{-1,-1};
    }
    else{
        return new int[]{lb, upperbound(arr, target, n) - 1};
    }

}
    public static void main(String[] args) {
     int arr[]={1,3,5,6,7,8,8,19,20};
     int n=arr.length;
     int target=8;
     System.out.println(Arrays.toString(first_last_occurance(arr, target,n)));
 }  

}
//better approch not the optimal one