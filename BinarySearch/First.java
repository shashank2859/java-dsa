package BinarySearch;

import java.util.Arrays;

public class First {
    public static int first(int arr[],int k, int  n){
        int low= 0;
        int high=n-1;
        int first=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==k){
                first=mid;
                high=mid-1;
            }
            else if(arr[mid]<k){
                low=mid+1;

            }
            else {
            high=mid-1;
            }

        }
        return first;

    }
    public static int last(int arr[],int k, int  n){
        int low= 0;
        int high=n-1;
        int last=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==k){
                last=mid;
                low=mid+1;
            }
            else if(arr[mid]<k){
                low=mid+1;

            }
            else{
                high=mid-1;
            }

        }

      return last;  
    }
    public static int[] first_last_occurance(int arr[],int k, int  n){
        int ft=first(arr, k,  n);

        if(ft==-1){
            return new int []{-1,-1};
        }

        int lt=last(arr, k,  n);

        return new int[]{ft,lt};
    }
    public static void main(String[] args) {
     int arr[]={1,3,5,6,7,8,8,19,20};
     int n=arr.length;
     int k=8;
     System.out.println(Arrays.toString(first_last_occurance(arr, k,n)));

    }
    
}
