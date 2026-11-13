package Recursion;


public class Reverse_array {

    public static void swap(int [] arr,int l,int r){
    int temp=arr[l];
    arr[l]=arr[r];
    arr[r]=temp;
}
    public static void reverse(int l,int r, int [] arr){
        if(l>=r)return;          
        
        swap(arr,l,r);
        reverse(l+1,r-1,arr);
        
    }
    
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        int l=0;
        int r=arr.length-1;
        reverse(l,r,arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    }
