public class Maximum_cards {
    static int maximum_cards(int[] arr, int k){
        int lsum=0;
        int rsum=0;
        int maxsum=0;
        for(int i=0;i<k;i++){
            lsum+=arr[i];
        }
            maxsum=lsum;
        
        int rindex=arr.length-1;
        for(int i=k-1;i>=0;i--){
            lsum-=arr[i];
            rsum+=arr[rindex];
            maxsum=Math.max(maxsum,rsum+lsum);
            rindex--;
        }
        return maxsum;

    }
public static void main(String[] args) {
    int [] arr={8,2,3,9,1,2,3,9};
    int k=4;
    System.out.println(maximum_cards(arr, k));
}
}
