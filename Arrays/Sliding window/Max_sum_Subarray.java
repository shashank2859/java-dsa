

public class Max_sum_Subarray {
    static int maxSum(int[] arr, int k) {
        int windowsum=0;
        int maxsum=0;
        int bestStart = 0;
        int bestEnd = k - 1;
        for(int i=0;i<k;i++){
            windowsum+=arr[i];
        }
        maxsum=windowsum;
        for(int i=k;i<arr.length;i++){
            windowsum=windowsum-arr[i-k]+arr[i];
            if(windowsum>maxsum){
            maxsum = windowsum;
            bestStart = i - k + 1;
            bestEnd = i;
        }
    }
    for(int i=bestStart;i<=bestEnd;i++){
        System.out.print(arr[i] +",");
    }
        return maxsum;

}
public static void main(String[] args) {
    int[] arr = {4, 2, 7, 1, 8, 3, 5};
    int k = 3;
    System.err.println(maxSum(arr, k));
}
}