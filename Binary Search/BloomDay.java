public class BloomDay {
    public static boolean ispossible(int[] bloomDay, int m, int k,int days){
        int count = 0;
        int total = 0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=days){
                count++;
            }
            else{
                total+=(count/k);
                count=0;
            }
        }
        total+=(count/k);
    
    if(total>=m){
        return true;
    }
    else{
        return false;
    }
    }
    public static int minDays(int[] bloomDay, int m, int k) {

        if((long)m*k>bloomDay.length) return -1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
         for(int i=0;i<bloomDay.length;i++){
            min=Math.min(bloomDay[i],min);
            max=Math.max(bloomDay[i],max);
         }
         int low=min;
         int high=max;

         while(low<=high){
            int mid=(low+high)/2;
            if(ispossible(bloomDay, m, k, mid)==true){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
         }
         return low;
    }
    public static void main(String[] args) {
        int [] bloomDay={6,6,6,7,8,9,10};
        int m=2;
        int k=3;
        System.out.println(minDays(bloomDay,  m, k));
    }
}
