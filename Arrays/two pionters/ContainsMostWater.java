public class ContainsMostWater {
    static int Contains_water(int[] arr){
        int left=0;
        int right=arr.length-1;
        int maxarea=0;
        while(left<right){
            int width=right-left;
            int height=Math.min(arr[left],arr[right]);
            int area=width*height;
            maxarea=Math.max(maxarea,area);
            if(arr[left]<=arr[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxarea;

    }
    public static void main(String[] args) {
        int [] arr={1,8,2,3,4,9};
        System.out.println(Contains_water(arr));

    }
}
