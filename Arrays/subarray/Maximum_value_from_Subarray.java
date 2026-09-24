public class Maximum_value_from_Subarray {
    static int MaximumSubarray (int[] arr) {
        int maxsum=arr[0];
        int sum=0;
        int start = 0;
        int bestStart = 0;
        int bestEnd = 0;
        for(int i= 0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>maxsum){
                maxsum=sum;
                bestStart=start;
                bestEnd=i;

            }
            if(sum<0){
                sum=0;
                start=i+1;
            }
        }
    return maxsum;
}
public static void main(String[] args) {
    int [] arr={1,-2,3,9,-9,9,9};
    System.out.println(MaximumSubarray(arr));
}
}