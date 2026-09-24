public class MaximumSubarray {
    static int MaximumSubarray (int[] arr) {
        int maxsum=arr[0];
        int sum=0;
        for(int i= 0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>maxsum){
                maxsum=sum;

            }
            if(sum<0){
                sum=0;
            }
        }
    return maxsum;
}
public static void main(String[] args) {
    int [] arr={1,-2,3,9,-9,9,9};
    System.out.println(MaximumSubarray(arr));
}
}