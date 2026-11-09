package BinarySearch;

public class upperBound {
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
 public static void main(String[] args) {
     int arr[]={1,3,5,6,7,8,19,20};
     int n=arr.length;
     int target=8;
     System.out.println(upperbound(arr, target,n));
 }  
}

