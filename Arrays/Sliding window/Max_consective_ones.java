public class Max_consective_ones {
    static int Max_consective_ones(int[]arr,int k){
        int left=0;
        int right=0;
        int maxlength=0;
        int zeroes=0;
        while(right<arr.length){
            if(arr[right]==0){
                zeroes++;
            }

            while(zeroes>k){
                if(arr[left]==0){
                    zeroes--;
                }
                left++;
            }
            if(zeroes<=k){
                int length=right-left+1;
                maxlength=Math.max(maxlength,length);
            }
         right++;    
        }
        return maxlength;

    }
   public static void main(String[] args) {
       int []arr={1,1,1,0,0,0,1,1,0};
       int k=2;
       System.out.println(Max_consective_ones(arr,k));
   } 
}
