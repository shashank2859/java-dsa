public class SmallDivisor {
    public static boolean ispossible(int[] nums, int threshold, int div) {
    int sum = 0;

    for (int i = 0; i < nums.length; i++) {
        sum += (int) Math.ceil((double) nums[i] / div);
    }

    return sum <= threshold;
}
    public static int max(int[] nums){
        int max=Integer.MIN_VALUE;
         for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
         }
         return max;
    }
    public static int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=max(nums);
        while(low<=high){
            int mid=(low+high)/2;
            if(ispossible(nums,threshold,mid)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int [] nums={1,2,4,5,6};
        int threshold=7;
        System.out.println(smallestDivisor(nums,threshold));
    }

}

