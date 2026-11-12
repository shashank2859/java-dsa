public class ShipPackages {
        public static int noOfDays(int[] weights,int capacity){
            int days=1;
            int load=0;
            for(int i=0;i<weights.length;i++){
                if(load+weights[i]>capacity){
                    days++;
                    load=weights[i];
                }
                else{
                    load+=weights[i];
                }
            }
            return days;
        }
        public static int sum(int[] weights){
        int sum=0;
         for(int i=0;i<weights.length;i++){
            sum+=weights[i];
         }
         return sum;
    }
    public static int max(int[] weights){
        int max=Integer.MIN_VALUE;
         for(int i=0;i<weights.length;i++){
            max=Math.max(weights[i],max);
         }
         return max;
    }
    public static int shipWithinDays(int[] weights, int days) {
        int low=max(weights);
        int high=sum(weights);
        while(low<=high){
            int mid=(low+high)/2;
            
            if(noOfDays(weights,mid)<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;
        System.out.println(shipWithinDays(weights,days));
    }
}

