public class longestsubarray {
     public static void main(String[] args) {
        int[] arr = {10, 1, 1, 1,1,7, 10};
        int l=0;
        int r=0;
        int sum=0;
        int k=14;
        int maxlen=0;
        while(r<arr.length){
            sum=sum+arr[r];
        while(sum>k) {
            sum=sum-arr[l];
            l++;
        }
        if(sum<=k){
            maxlen=Math.max(maxlen,r-l+1);
        }   
        r++;
        }
        System.out.println(maxlen); 
}
}