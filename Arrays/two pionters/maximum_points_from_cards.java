public class maximum_points_from_cards {
    public static void main(String[] args) {
        int [] arr={6, 2, 3, 4, 7, 2, 1, 7, 1};
        int k=4;
        int lsum=0;
        int rsum=0;
        int n=arr.length;
        int maxsum;
        for (int i=0;i<k;i++){
            lsum+=arr[i];
            
        }
        maxsum=lsum;
        int rindex=n-1;

        for(int i=k-1;i>=0;i--){
            lsum-=arr[i];
            rsum+=arr[rindex];
            rindex--;
            maxsum=Math.max(maxsum,lsum+rsum);
        }
        System.out.println(maxsum);

    }

}
