public class isPalindrome {
    static boolean isPalindrome(String s){
         char[] arr = s.toCharArray();
         int left=0;
         int right= arr.length-1;
         while(left<right){
            if(arr[left]!=arr[right]){
                return false;
            }
            left++;
            right--;
         }
         return true;
    }
    public static void main(String[] args) {
        String s ="madam";
        System.out.println(isPalindrome( s));
    }
}
