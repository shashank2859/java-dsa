
import java.util.Arrays;

public class TwoSum_II {
    static int[] twoSum(int[] arr, int target){
        int n=arr.length;
        int l=0;
        int r=n-1;
        while(l<r){
            int sum = arr[l] + arr[r];
            if(sum==target){
                return new int[]{arr[l], arr[r]};

            }
            else if(sum>target){
                r--;
            }
            else if(sum<target){
                l++;
            }
            else{
                return new int[]{-1, -1};
            }
        }

        return new int[]{arr[l],arr[r] };
    }
    public static void main(String[] args) {
        int [] arr ={1,3,5,6,7,8};
        int target =15;
        System.err.println(Arrays.toString(twoSum(arr,target)));


    }
}
