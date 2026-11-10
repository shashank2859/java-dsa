public class find_sqrt {
public static int mySqrt(int x) {
        long low=1;
        long high=x;
        while(low<=high){
            long mid=(low+high)/2;
            long val=(mid*mid);
            if(val<=x){
                low=mid+1;
            }
            else{
                  high=mid-1;
            }
        }
        return Math.round(high);
    }
    public static void main(String[] args) {
        int x=25;
        System.out.println(mySqrt(x));
    }
}
