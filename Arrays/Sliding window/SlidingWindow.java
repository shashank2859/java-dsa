public class SlidingWindow {

    public static void main(String[] args) {

        int []arr={2,5,1,7,10};
        int k=14;
        int maxlen=0;
        for (int i=0; i<arr.length; i++) {
        int sum=0;
        for(int j=i;j<arr.length;j++){
            sum+=arr[j];
            if(sum<=k){
                maxlen=Math.max(maxlen,j-i+1);
            }
            else if(sum>k){
                break;
            }

        }

        }
        System.out.println(maxlen);

    }
}